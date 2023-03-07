package com.poc.neo4jrestapi.infrastructure.neo4jrepository;

import com.poc.neo4jrestapi.domain.entity.Manufacturer;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Neo4jManufacturerRepository extends Neo4jRepository<Manufacturer, Long> {

    @Query("MATCH (m:Manufacturer)-[:OWNS]->(b:Brand) RETURN m")
    List<Manufacturer> getAllManufacturers();

    List<Manufacturer> findByMfgCode(String mfgCode);

}
