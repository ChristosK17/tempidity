package com.rest.measurements;

import com.rest.assemblers.MeasurementAssembler;
import com.rest.repositories.MeasurementRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class MeasurementController {
    private final MeasurementRepository repository;
    private final MeasurementAssembler assembler;

    MeasurementController(MeasurementRepository repository, MeasurementAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/measurements")
    @GetMapping("/measurements/{measurementId}")
    @GetMapping("/measurements/{sensorType}")
    @GetMapping("/measurements/{Latitude}/{Longitude}")
    @GetMapping("/measurements/{Timestamp}")
    @PostMapping("/measurements")
    @PutMapping("/measurements/{measurementId}")
    @DeleteMapping("/measurements/{measurementId}")
}
