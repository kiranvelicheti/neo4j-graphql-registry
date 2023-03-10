package com.poc.feignclient.application.restapi;

import com.poc.feignclient.domain.client.IManufacturerClient;
import com.poc.feignclient.domain.Manufacturer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manufacturer")
@RequiredArgsConstructor
public class ManufacturerController {

    private final IManufacturerClient IManufacturerClient;

    @GetMapping
    public List<Manufacturer> getManufacturers() {
        return IManufacturerClient.listManufacturers();
    }

    @PostMapping
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return IManufacturerClient.createManufacturer(manufacturer);
    }
}
