package com.oreilly.feignclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GraphQLClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphQLClientApplication.class, args);
    }

}
