package com.poc.neo4jrestapi.infrastructure.repository;

import com.poc.neo4jrestapi.domain.entity.Attribute;
import java.util.List;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeNeo4jRepository extends Neo4jRepository<Attribute, Long> {

    List<Attribute> findByName(String mfgCode);

}
