package com.poc.feignclient.infrastructure.client;

import com.poc.feignclient.domain.Manufacturer;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(name = "MANUFACTURER-SERVICE")
public interface ManufacturerFeignClient {

    @GetMapping("/manufacturer")
    List<Manufacturer> listManufacturers();


    @PostMapping("/manufacturer")
    Manufacturer createManufacturer(Manufacturer manufacturer);

    @Component
    class ManufacturerFeignClientFallBack implements ManufacturerFeignClient {

        @Override
        public List<Manufacturer> listManufacturers() {
            return List.of(Manufacturer.builder().mfgCode("From Circuit Breaker").build());
        }

        @Override
        public Manufacturer createManufacturer(Manufacturer manufacturer) {
            return new Manufacturer();
        }
    }
}