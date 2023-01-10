package com.oreilly.neo4jrestapi.domain.service;

import com.oreilly.neo4jrestapi.application.service.IAttributeService;
import com.oreilly.neo4jrestapi.domain.entity.Attribute;
import com.oreilly.neo4jrestapi.infrastructure.repository.AttributeRepository;
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