package com.poc.neo4jrestapi.infrastructure.repository;

import com.poc.neo4jrestapi.domain.entity.Manufacturer;
import com.poc.neo4jrestapi.domain.repository.IManufacturerRepository;
import com.poc.neo4jrestapi.infrastructure.neo4jrepository.Neo4jManufacturerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class ManufacturerRepository implements IManufacturerRepository {

    private final Neo4jManufacturerRepository neo4jManufacturerRepository;

    @Override
    public List<Manufacturer> getAllManufacturers() {
        return neo4jManufacturerRepository.getAllManufacturers();
    }

    @Override
    public Manufacturer createManufacturer(Manufacturer manufacturer) {
        return neo4jManufacturerRepository.save(manufacturer);
    }

    @Override
    public List<Manufacturer> findByMfgCode(String mfgCode) {
        return neo4jManufacturerRepository.findByMfgCode(mfgCode);
    }

    @Override
    public List<Manufacturer> createManufacturers(List<Manufacturer> manufacturers) {
        return neo4jManufacturerRepository.saveAll(manufacturers);
    }
}
