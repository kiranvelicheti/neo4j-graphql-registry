package com.poc.feignclient.infrastructure.client;

import com.poc.feignclient.domain.Attribute;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(name = "ATTRIBUTE-SERVICE")
public interface AttributeFeignClient {

    @GetMapping("/attribute")
    List<Attribute> getAllAttributes();


    @PostMapping("/attribute")
    Attribute createAttribute(Attribute attribute);
}