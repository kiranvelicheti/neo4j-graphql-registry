package com.oreilly.feignclient.domain.client;

import com.oreilly.feignclient.domain.Manufacturer;
import com.oreilly.feignclient.infrastructure.client.ManufacturerFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ManufacturerClient implements IManufacturerClient {

    private final ManufacturerFeignClient manufacturerFeignClient;

    @Override
    public List<Manufacturer> listManufacturers() {
        return manufacturerFeignClient.listManufacturers();
    }

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        return manufacturerFeignClient.createManufacturer(manufacturer);
    }
}
