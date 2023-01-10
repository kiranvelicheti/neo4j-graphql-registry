package com.oreilly.neo4jrestapi.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ManufacturerWorkFlow {

    private UUID id;
    private Manufacturer manufacturer;
    private List<Brand> brand;
    private String status;
}
