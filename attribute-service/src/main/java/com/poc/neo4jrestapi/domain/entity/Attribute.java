package com.poc.neo4jrestapi.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attribute {

    @Id
    @GeneratedValue
    public Long id;
    public Integer attributeID;
    private String name;
    public String type;
}
