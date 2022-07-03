package io.wallmans.mediamonitor.storage.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "newspaper", type = "article")
public class ArticleESModel {

  @Id
  private String id;

  private String title;

  @Field(type = FieldType.Nested, includeInParent = true)
  private List<Author> authors;

}
