package io.wallmans.mediamonitor.storage;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "io.wallmans.mediamonitor.storage.repository")
@ComponentScan(basePackages = {"io.wallmans.mediamonitor.storage"})
public class ElasticSearchConfig {

  @Bean
  public RestHighLevelClient client() {
    final ClientConfiguration clientConfiguration
        = ClientConfiguration.builder()
                             .connectedTo("localhost:9200")
                             .build();

    return RestClients.create(clientConfiguration).rest();
  }

  @Bean
  public ElasticsearchOperations elasticsearchTemplate() {
    return new ElasticsearchRestTemplate(client());
  }
}