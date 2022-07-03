# Elastic Search

## Getting it running:

Instruction URL:
https://www.elastic.co/guide/en/elastic-stack-get-started/current/get-started-stack-docker.html



## macOS setup:
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
-> Elasticsearch security features have been automatically configured!
-> Authentication is enabled and cluster connections are encrypted.

->  Password for the elastic user (reset with `bin/elasticsearch-reset-password -u elastic`):
RN8PoCfSiaZXfgHIVx-M

->  HTTP CA certificate SHA-256 fingerprint:
c7944d7a093566087a99307def5ea02ec5cd902820cbee2541ebbdcca64655c0

->  Configure Kibana to use this cluster:

* Run Kibana and click the configuration link in the terminal when Kibana starts.
* Copy the following enrollment token and paste it into Kibana in your browser (valid for the next 30 minutes):
  eyJ2ZXIiOiI4LjIuMCIsImFkciI6WyIxNzIuMjAuMC4yOjkyMDAiXSwiZmdyIjoiYzc5NDRkN2EwOTM1NjYwODdhOTkzMDdkZWY1ZWEwMmVjNWNkOTAyODIwY2JlZTI1NDFlYmJkY2NhNjQ2NTVjMCIsImtleSI6IjhYV1ZrSUFCRXpoeV96aWFPT3Y3OkxqLVlGZ01wUnp5ZXFGZGtxRlVhbUEifQ==

-> Configure other nodes to join this cluster:

* Copy the following enrollment token and start new Elasticsearch nodes
  with `bin/elasticsearch --enrollment-token <token>` (valid for the next 30 minutes):
  eyJ2ZXIiOiI4LjIuMCIsImFkciI6WyIxNzIuMjAuMC4yOjkyMDAiXSwiZmdyIjoiYzc5NDRkN2EwOTM1NjYwODdhOTkzMDdkZWY1ZWEwMmVjNWNkOTAyODIwY2JlZTI1NDFlYmJkY2NhNjQ2NTVjMCIsImtleSI6IjgzV1ZrSUFCRXpoeV96aWFPZXNwOmhDLWZfdWZuVGdtVDhfTkE1a2pfU3cifQ==

  If you're running in Docker, copy the enrollment token and run:
  `docker run -e "ENROLLMENT_TOKEN=<token>" docker.elastic.co/elasticsearch/elasticsearch:8.2.0`

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

