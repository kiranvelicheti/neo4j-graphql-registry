package com.poc.neo4jrestapi.infrastructure.neo4jrepository;

import com.poc.neo4jrestapi.domain.entity.Brand;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Neo4jBrandRepository extends Neo4jRepository<Brand, String> {

    @Query("MATCH (b:Brand) RETURN b")
    List<Brand> getAllBrands();
}
