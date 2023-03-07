<br />
<div align="center">
<h3 align="center">GraphQL API with Feign Client and circuit breaker, Eureka Discovery Server, Eureka Client  POC</h3>

  <p align="center">
    Working POC with multiple modules.  
    <br />
  </p>
</div>

<!-- GETTING STARTED -->

## Getting Started

* Discovery Server : Eureka discover server POC
* Manufacturer Service: Manufacturer related Rest APIs registered to discovery server and sources data from GraphDB (NEO4J) 
* Attribute Service: Attribute related Rest APIs registered to discovery server and sources data from GraphDB (NEO4J)
* GraphQL client: Graph QL API which is a data layer for Rest APIs which are invoked using Feign Client with Resilience4j fault tolerance

### Installation

1. Get docker desktop from https://www.docker.com/products/docker-desktop/

### Important links

1. Eureka Server : http://localhost:8761
2. Neo4j Web console: http://localhost:7474/browser/
3. Manufacturer Swagger: http://localhost:8089/swagger-ui/index.html
4. Attribute Swagger: http://localhost:8091/swagger-ui/index.html
5. GraphQL Feign Client Swagger: http://localhost:8090/swagger-ui/index.html

<p align="right">(<a href="#readme-top">back to top</a>)</p>
