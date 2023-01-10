package com.oreilly.feignclient.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Attribute {
    public Long id;
    public Integer attributeID;
    private String name;
    public String type;
}
