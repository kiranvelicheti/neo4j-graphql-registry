package com.poc.feignclient.domain.client;

import com.poc.feignclient.domain.Attribute;

import java.util.List;


public interface IAttributeClient {

    List<Attribute> getAllAttributes();
    Attribute createAttribute(Attribute attribute);
}