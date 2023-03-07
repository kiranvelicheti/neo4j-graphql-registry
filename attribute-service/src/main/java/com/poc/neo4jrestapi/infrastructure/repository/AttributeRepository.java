package com.poc.neo4jrestapi.infrastructure.repository;

import com.poc.neo4jrestapi.domain.entity.Attribute;
import com.poc.neo4jrestapi.domain.repository.IAttributeRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class AttributeRepository implements IAttributeRepository {

    private final AttributeNeo4jRepository attributeNeo4jRepository;

    public List<Attribute> findByName(String mfgCode) {
        return attributeNeo4jRepository.findByName(mfgCode);
    }

    @Override
    public List<Attribute> getAllAttributes() {
        return attributeNeo4jRepository.findAll();
    }

    @Override
    public Attribute createAttribute(Attribute attribute) {
        return attributeNeo4jRepository.save(attribute);
    }

}
