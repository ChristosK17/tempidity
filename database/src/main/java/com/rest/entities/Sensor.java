package com.rest.entities;

import com.rest.custom.Loc;
import com.rest.custom.SensorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public @Data class Sensor {

    private @Id @GeneratedValue Long Id;
    private String sensorId;
    private SensorType type;
    private String vendorName;
    private String vendorEmail;
    private String description;
    private Loc location;
}
