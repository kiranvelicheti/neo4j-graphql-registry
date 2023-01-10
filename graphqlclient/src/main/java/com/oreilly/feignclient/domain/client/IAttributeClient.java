package com.oreilly.feignclient.domain.client;

import com.oreilly.feignclient.domain.Attribute;

import java.util.List;


public interface IAttributeClient {

    List<Attribute> getAllAttributes();
    Attribute createAttribute(Attribute attribute);
}