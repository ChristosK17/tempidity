package com.rest.entities;

import com.rest.custom.SensorType;
import com.rest.custom.ValueUnit;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.sql.Timestamp;

@Entity
public @Data class Measurement {
    private @Id @GeneratedValue Long Id;
    private String sensorId;
    private SensorType measurementType;
    private ValueUnit measurementValue;
    private Timestamp measurementDate;
    private String description;
}
