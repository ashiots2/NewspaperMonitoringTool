package io.wallmans.mediamonitor.domain;

import java.net.URL;

public record Article(String id, String title, URL url, String datetime) {
}
