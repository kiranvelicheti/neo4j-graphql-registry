package com.oreilly.neo4jrestapi.application.restapi;

import com.oreilly.neo4jrestapi.domain.service.IManufacturerService;
import com.oreilly.neo4jrestapi.domain.entity.Manufacturer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/{mfgCode}")
    public List<Manufacturer> getManufacturersByCode(@PathVariable String mfgCode) {
        return manufacturerService.getAllManufacturerByCode(mfgCode);
    }
}
