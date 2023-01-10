package com.oreilly.feignclient.domain.service;

import com.oreilly.feignclient.domain.client.IManufacturerClient;
import com.oreilly.feignclient.domain.Manufacturer;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@GraphQLApi
public class ManufacturerService implements IManufacturerService {

    private final IManufacturerClient IManufacturerClient;

    @Override
    public List<Manufacturer> getAllManufacturers() {
        return IManufacturerClient.listManufacturers();
    }

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        return IManufacturerClient.createManufacturer(manufacturer);
    }
}