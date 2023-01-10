package com.oreilly.feignclient.infrastructure.client;

import com.oreilly.feignclient.domain.Manufacturer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@FeignClient(name = "MANUFACTURER-SERVICE", fallback = ManufacturerFeignClient.ManufacturerFeignClientFallBack.class)
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