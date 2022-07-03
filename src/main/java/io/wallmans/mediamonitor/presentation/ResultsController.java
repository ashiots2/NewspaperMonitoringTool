package io.wallmans.mediamonitor.presentation;

import io.wallmans.mediamonitor.connector.politis.PolitisConnector;
import io.wallmans.mediamonitor.domain.Article;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/politis")
public class ResultsController {
  private final PolitisConnector politisConnector = new PolitisConnector();

  @GetMapping
  public List<Article> getDocument() {
    return politisConnector.getDocument();
  }
}
