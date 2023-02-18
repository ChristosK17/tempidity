package com.rest.repositories;

import com.rest.entities.Measurement;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SensorRepository extends MongoRepository<Measurement, Long> {
}
