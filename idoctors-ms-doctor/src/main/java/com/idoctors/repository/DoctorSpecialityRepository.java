package com.idoctors.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.idoctors.domain.DoctorSpeciality;

public interface DoctorSpecialityRepository extends CrudRepository<DoctorSpeciality, Integer> {
	List<DoctorSpeciality> findAllDoctorSpecialitiesByDoctorId(Integer doctorId);
}
