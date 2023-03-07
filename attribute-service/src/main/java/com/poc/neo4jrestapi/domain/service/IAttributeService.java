package com.poc.neo4jrestapi.domain.service;


import com.poc.neo4jrestapi.domain.entity.Attribute;

import java.util.List;

public interface IAttributeService {

    List<Attribute> getAllAttributes();

    List<Attribute> getAttributeByName(String mfgCode);

    Attribute createAttribute(Attribute attribute);
}

