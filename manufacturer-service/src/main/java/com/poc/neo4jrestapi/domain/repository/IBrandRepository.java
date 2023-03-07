package com.poc.neo4jrestapi.domain.repository;

import com.poc.neo4jrestapi.domain.entity.Brand;

import java.util.List;


public interface IBrandRepository {

    List<Brand> getAllBrands();

    List<Brand> createBrands(List<Brand> brands);

    Brand createBrand(Brand brand);
}
