package com.oreilly.neo4jrestapi.application.restapi;

import com.oreilly.neo4jrestapi.domain.service.IAttributeService;
import com.oreilly.neo4jrestapi.domain.entity.Attribute;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attribute")
@RequiredArgsConstructor
public class AttributeController {

    private final IAttributeService attributeService;

    @GetMapping
    public List<Attribute> getAttributes() {
        return attributeService.getAllAttributes();
    }

    @GetMapping("/{name}")
    public List<Attribute> getAttributeByName(@PathVariable String name) {
        return attributeService.getAttributeByName(name);
    }

    @PostMapping
    public Attribute createManufacturer(@RequestBody Attribute attribute) {
        return attributeService.createAttribute(attribute);
    }
}
