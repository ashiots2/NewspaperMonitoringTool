package io.wallmans.mediamonitor.connector.politis;

import io.wallmans.mediamonitor.domain.Article;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Objects;

public class PolitisConnector {

  public List<Article> getDocument() {
    try {
      final Document document = Jsoup.connect("https://politis.com.cy/category/politis-news/").get();
      final Elements elements = document.getElementsByTag("article");
      return elements.parallelStream().map(e -> {
        final String postId = e.attributes().get("id");
        final URL url = getURLFromArticle(e);
        final String title = Objects.requireNonNull(e.select("h2 a").first()).text();
        final String datetime = Objects.requireNonNull(e.select("p span").first()).text();
        return new Article(postId, title, url, datetime);
      }).toList();
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  private URL getURLFromArticle(final Element e) {
    final Element links = e.getElementsByTag("a").first();
    if (links == null) {
      return null;
    }
    try {
      return new URL(links.attributes().get("href"));
    } catch (final MalformedURLException ex) {
      return null;
    }
  }
}
