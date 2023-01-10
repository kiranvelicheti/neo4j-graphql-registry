package com.oreilly.feignclient.domain.client;

import com.oreilly.feignclient.domain.Manufacturer;

import java.util.List;


public interface IManufacturerClient {
    List<Manufacturer> listManufacturers();
    Manufacturer createManufacturer(Manufacturer manufacturer);
}