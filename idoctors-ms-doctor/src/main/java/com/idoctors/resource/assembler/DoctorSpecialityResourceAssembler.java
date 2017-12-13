package com.idoctors.resource.assembler;

import org.springframework.hateoas.mvc.ResourceAssemblerSupport;
import org.springframework.stereotype.Component;

import com.idoctors.controller.DoctorController;
import com.idoctors.domain.DoctorSpeciality;
import com.idoctors.resource.DoctorSpecialityResource;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.hateoas.Link;

/**
 * @author Shukri Shukriev
**/

@Component
public class DoctorSpecialityResourceAssembler extends ResourceAssemblerSupport<DoctorSpeciality, DoctorSpecialityResource> {

	public DoctorSpecialityResourceAssembler() {
		super(DoctorSpeciality.class, DoctorSpecialityResource.class);
	}

	@Override
	public DoctorSpecialityResource toResource(DoctorSpeciality doctorSpeciality) {
		DoctorSpecialityResource doctorSpecialityReource = new DoctorSpecialityResource(doctorSpeciality);
		
		Link selfLink = linkTo(methodOn(DoctorController.class).findDoctorSpecialityById(doctorSpeciality.getDoctor().getId(), doctorSpeciality.getSpeciality().getId())).withSelfRel();
		
		doctorSpecialityReource.add(selfLink);
		
		return doctorSpecialityReource;
	}
	
	
}
