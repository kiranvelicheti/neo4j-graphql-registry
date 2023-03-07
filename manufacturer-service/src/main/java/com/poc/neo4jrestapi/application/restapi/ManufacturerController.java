package com.poc.neo4jrestapi.application.restapi;

import com.poc.neo4jrestapi.domain.service.IManufacturerService;
import com.poc.neo4jrestapi.domain.entity.Manufacturer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ManufacturerController {

    private final IManufacturerService manufacturerService;

    @GetMapping("/manufacturer")
    public List<Manufacturer> getManufacturers() {
        return manufacturerService.getAllManufacturers();
    }

    @PostMapping("/manufacturer")
    public Manufacturer createManufacturer(@RequestBody Manufacturer manufacturer) {
        return manufacturerService.createManufacturer(manufacturer);
    }

    @GetMapping("/{mfgCode}")
    public List<Manufacturer> getManufacturersByCode(@PathVariable String mfgCode) {
        return manufacturerService.getAllManufacturerByCode(mfgCode);
    }
}
