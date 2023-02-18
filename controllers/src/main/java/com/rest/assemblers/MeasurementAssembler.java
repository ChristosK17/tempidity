package com.rest.assemblers;

import com.rest.entities.Measurement;
import com.rest.measurements.MeasurementsController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.stereotype.Service;

@Service
public class MeasurementAssembler implements RepresentationModelAssembler<Measurement, EntityModel<Measurement>> {
    @Override
    public EntityModel<Measurement> toModel(Measurement student) {
        return EntityModel.of(student,
                linkTo(methodOn(MeasurementsController.class).getOne(student.getId())).withSelfRel(),
                linkTo(methodOn(MeasurementsController.class).getAll()).withRel("measurements"));
    }
}
