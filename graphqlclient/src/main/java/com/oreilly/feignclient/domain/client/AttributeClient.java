package com.oreilly.feignclient.domain.client;

import com.oreilly.feignclient.domain.Attribute;
import com.oreilly.feignclient.infrastructure.client.AttributeFeignClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class AttributeClient implements IAttributeClient {

    private final AttributeFeignClient attributeFeignClient;

    @Override
    public List<Attribute> getAllAttributes() {
        return attributeFeignClient.getAllAttributes();
    }

    @Override
    public Attribute createAttribute(Attribute attribute) {
        return attributeFeignClient.createAttribute(attribute);
    }
}
