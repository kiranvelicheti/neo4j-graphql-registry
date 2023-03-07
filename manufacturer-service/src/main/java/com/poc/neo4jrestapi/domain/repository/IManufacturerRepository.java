package com.poc.neo4jrestapi.domain.repository;

import com.poc.neo4jrestapi.domain.entity.Manufacturer;

import java.util.List;

public interface IManufacturerRepository {

    List<Manufacturer> getAllManufacturers();

    Manufacturer createManufacturer(Manufacturer manufacturer);

    List<Manufacturer> findByMfgCode(String mfgCode);

    List<Manufacturer> createManufacturers(List<Manufacturer> manufacturers);
}
