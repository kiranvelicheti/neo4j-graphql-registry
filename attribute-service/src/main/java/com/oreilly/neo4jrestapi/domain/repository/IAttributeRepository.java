package com.oreilly.neo4jrestapi.domain.repository;

import com.oreilly.neo4jrestapi.domain.entity.Attribute;

import java.util.List;

public interface IAttributeRepository {

    List<Attribute> findByName(String mfgCode);

    List<Attribute> getAllAttributes();

    Attribute createAttribute(Attribute attribute);
}
