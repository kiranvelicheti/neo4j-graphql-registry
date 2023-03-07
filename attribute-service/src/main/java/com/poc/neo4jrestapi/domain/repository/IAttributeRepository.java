package com.poc.neo4jrestapi.domain.repository;

import com.poc.neo4jrestapi.domain.entity.Attribute;
import java.util.List;

public interface IAttributeRepository {

    List<Attribute> findByName(String mfgCode);

    List<Attribute> getAllAttributes();

    Attribute createAttribute(Attribute attribute);
}
