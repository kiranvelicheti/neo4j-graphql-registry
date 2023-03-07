package com.poc.neo4jrestapi.infrastructure.repository;

import com.poc.neo4jrestapi.domain.entity.Brand;
import com.poc.neo4jrestapi.domain.repository.IBrandRepository;
import com.poc.neo4jrestapi.infrastructure.neo4jrepository.Neo4jBrandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BrandRepository implements IBrandRepository {

    private final Neo4jBrandRepository neo4jBrandRepository;

    @Override
    public List<Brand> getAllBrands() {
        return neo4jBrandRepository.getAllBrands();
    }

    @Override
    public List<Brand> createBrands(List<Brand> brands) {
        return neo4jBrandRepository.saveAll(brands);
    }

    @Override
    public Brand createBrand(Brand brand) {
        return neo4jBrandRepository.save(brand);
    }
}
