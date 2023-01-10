package com.oreilly.neo4jrestapi.infrastructure.repository;

import com.oreilly.neo4jrestapi.domain.entity.Attribute;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeNeo4jRepository extends Neo4jRepository<Attribute, Long> {

    List<Attribute> findByName(String mfgCode);

}
