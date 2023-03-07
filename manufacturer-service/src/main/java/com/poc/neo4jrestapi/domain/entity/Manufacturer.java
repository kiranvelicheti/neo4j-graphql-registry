package com.poc.neo4jrestapi.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;


@Node
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Manufacturer {
    @Id
    @GeneratedValue
    public Long id;
    public Integer manufacturerID;
    private String mfgCode;
    private String mfgName;
    public String spanishMfgName;
    public String mfgLogo;
    public String mfgThumbnail;
    @Relationship(type = "OWNS")
    private List<Brand> brands;
}
