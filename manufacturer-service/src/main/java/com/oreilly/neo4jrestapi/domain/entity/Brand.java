package com.oreilly.neo4jrestapi.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

@Node
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Brand {
    @Id
    public String brandCode;
    public String brandName;
    public String brandLogo;
}
