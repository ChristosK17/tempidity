package com.rest.repositories;

import com.rest.entities.Measurement;
import org.springframework.data.mongodb.repository.MongoRepository;

//@RepositoryRestResource(collectionResourceRel = "measurements", path = "measurements")
public interface MeasurementRepository extends MongoRepository<Measurement, Long> {
}
