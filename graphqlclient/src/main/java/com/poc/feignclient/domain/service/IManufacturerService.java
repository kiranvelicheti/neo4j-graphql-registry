package com.poc.feignclient.domain.service;


import com.poc.feignclient.domain.Manufacturer;

import java.util.List;

public interface IManufacturerService {
    List<Manufacturer> getAllManufacturers();

//    List<Manufacturer> createManufacturers(List<Manufacturer> manufacturers);
//
//    List<Manufacturer> getManufacturersWithBrands();
//
//    List<Manufacturer> getAllManufacturerByCode(@GraphQLArgument(name = "mfgCode") String mfgCode);

    Manufacturer createManufacturer(Manufacturer manufacturer);
}

