package com.poc.neo4jrestapi.application.service;

import com.poc.neo4jrestapi.domain.entity.Attribute;
import com.poc.neo4jrestapi.domain.service.IAttributeService;
import com.poc.neo4jrestapi.infrastructure.repository.AttributeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AttributeService implements IAttributeService {

    private final AttributeRepository attributeRepository;

    @Override
    public List<Attribute> getAllAttributes() {
        return attributeRepository.getAllAttributes();
    }

    @Override
    public List<Attribute> getAttributeByName(String name) {
        return attributeRepository.findByName(name);
    }


    @Override
    public Attribute createAttribute(Attribute attribute) {
        return attributeRepository.createAttribute(attribute);
    }

}