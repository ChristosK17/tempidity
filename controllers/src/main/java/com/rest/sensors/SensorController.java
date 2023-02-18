package com.rest.sensors;

import com.rest.assemblers.SensorAssembler;
import org.springframework.web.bind.annotation.*;
import com.rest.repositories.SensorRepository;

@RestController
public class SensorController {
    private final SensorRepository repository;
    private final SensorAssembler assembler;

    SensorController(SensorRepository repository, SensorAssembler assembler) {
        this.repository = repository;
        this.assembler = assembler;
    }

    @GetMapping("/sensors")
    public void getAll() {

    }
    @GetMapping("/sensors/{sensorId}")
    @PostMapping("/sensors")
    @PutMapping("/sensors/{sensorId}")
    @DeleteMapping("/sensors/{sensorId}")
}
