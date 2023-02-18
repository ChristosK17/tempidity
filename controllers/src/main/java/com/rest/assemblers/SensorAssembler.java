package com.rest.assemblers;

import com.rest.entities.Sensor;
import com.rest.sensors.SensorController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.stereotype.Service;

@Service
public class SensorAssembler implements RepresentationModelAssembler<Sensor, EntityModel<Sensor>> {
    @Override
    public EntityModel<Sensor> toModel(Sensor student) {
        return EntityModel.of(student,
                linkTo(methodOn(SensorController.class).getOne(student.getId())).withSelfRel(),
                linkTo(methodOn(SensorController.class).getAll()).withRel("sensors"));
    }
}
