package com.oreilly.neo4jrestapi.domain.service;

import com.oreilly.neo4jrestapi.domain.entity.Brand;
import com.oreilly.neo4jrestapi.domain.repository.IBrandRepository;
import com.oreilly.neo4jrestapi.domain.service.IBrandService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BrandService implements IBrandService {

    private final IBrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrands() {
        return brandRepository.getAllBrands();
    }

    @Override
    public List<Brand> createBrands(List<Brand> brands) {
        return brandRepository.createBrands(brands);
    }

    @Override
    public Brand createBrand(Brand brand) {
        return brandRepository.createBrand(brand);
    }
}
