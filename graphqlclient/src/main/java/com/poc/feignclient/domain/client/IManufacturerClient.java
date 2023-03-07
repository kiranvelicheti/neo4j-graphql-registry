package com.poc.feignclient.domain.client;

import com.poc.feignclient.domain.Manufacturer;

import java.util.List;


public interface IManufacturerClient {
    List<Manufacturer> listManufacturers();
    Manufacturer createManufacturer(Manufacturer manufacturer);
}