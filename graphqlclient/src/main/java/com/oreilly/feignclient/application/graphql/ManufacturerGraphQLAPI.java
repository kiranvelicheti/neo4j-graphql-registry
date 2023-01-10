package com.oreilly.feignclient.application.graphql;

import com.oreilly.feignclient.domain.Manufacturer;
import com.oreilly.feignclient.domain.service.IManufacturerService;
import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;
import io.leangen.graphql.spqr.spring.annotations.GraphQLApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@GraphQLApi
public class ManufacturerGraphQLAPI {

    private final IManufacturerService manufacturerService;

    @GraphQLQuery(name = "getAllManufacturers")
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerService.getAllManufacturers();
    }

    @GraphQLMutation(name = "createManufacturer")
    public Manufacturer createManufacturer(@GraphQLArgument(name = "newManufacturer") Manufacturer manufacturer) {
        return manufacturerService.createManufacturer(manufacturer);
    }
}