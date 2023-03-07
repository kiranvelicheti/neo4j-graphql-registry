package com.poc.neo4jrestapi.domain.service;

import com.poc.neo4jrestapi.domain.entity.Manufacturer;
import com.poc.neo4jrestapi.domain.repository.IManufacturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManufacturerService implements IManufacturerService {

    private final IManufacturerRepository manufacturerRepository;

    @Override
    public List<Manufacturer> getAllManufacturers() {
        return manufacturerRepository.getAllManufacturers();
    }

    @Override
    public List<Manufacturer> getManufacturersWithBrands() {
        return manufacturerRepository.getAllManufacturers();
    }

    @Override
    public List<Manufacturer> getAllManufacturerByCode(String mfgCode) {
        return manufacturerRepository.findByMfgCode(mfgCode);
    }

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        return manufacturerRepository.createManufacturer(manufacturer);
    }

    @Override
    public List<Manufacturer> createManufacturers(List<Manufacturer> manufacturers) {
        return manufacturerRepository.createManufacturers(manufacturers);
    }
}