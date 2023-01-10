package com.oreilly.neo4jrestapi.application.service;


import com.oreilly.neo4jrestapi.domain.entity.Manufacturer;

import java.util.List;

public interface IManufacturerService {

    List<Manufacturer> getAllManufacturers();

    List<Manufacturer> createManufacturers(List<Manufacturer> manufacturers);

    List<Manufacturer> getManufacturersWithBrands();

    List<Manufacturer> getAllManufacturerByCode(String mfgCode);

    Manufacturer createManufacturer(Manufacturer manufacturer);
}

