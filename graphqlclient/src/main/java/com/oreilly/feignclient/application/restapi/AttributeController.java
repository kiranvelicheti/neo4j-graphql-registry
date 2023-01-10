package com.oreilly.feignclient.application.restapi;

import com.oreilly.feignclient.domain.client.IAttributeClient;
import com.oreilly.feignclient.domain.Attribute;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/attribute")
@RequiredArgsConstructor
public class AttributeController {

    private final IAttributeClient IAttributeClient;

    @GetMapping
    public List<Attribute> getAttributes() {
        return IAttributeClient.getAllAttributes();
    }

    @PostMapping
    public Attribute createAttribute(@RequestBody Attribute attribute) {
        return IAttributeClient.createAttribute(attribute);
    }
}
