package com.oreilly.neo4jrestapi.application.service;


import com.oreilly.neo4jrestapi.domain.entity.Brand;

import java.util.List;

public interface IBrandService {
    List<Brand> getAllBrands();

    List<Brand> createBrands(List<Brand> brands);

    Brand createBrand(Brand brand);
}

