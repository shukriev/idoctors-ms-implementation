package com.idoctors.service;

import com.idoctors.domain.Speciality;

/**
 * @author Shukri Shukriev
 *
 */

public interface SpecialityService {
	
	Iterable<Speciality> findAllSpecialities();

	Speciality getSpecialityById(Integer id);

	Speciality saveSpeciality(Speciality speciality);
}
