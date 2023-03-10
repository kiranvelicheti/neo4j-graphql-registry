package com.poc.feignclient.application.restapi;

import com.poc.feignclient.domain.Attribute;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attribute")
@RequiredArgsConstructor
public class AttributeController {

    private final com.poc.feignclient.domain.client.IAttributeClient IAttributeClient;

    @GetMapping
    public List<Attribute> getAttributes() {
        return IAttributeClient.getAllAttributes();
    }

    @PostMapping
    public Attribute createAttribute(@RequestBody Attribute attribute) {
        return IAttributeClient.createAttribute(attribute);
    }
}
