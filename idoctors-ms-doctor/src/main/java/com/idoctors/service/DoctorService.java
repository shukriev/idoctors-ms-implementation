package com.idoctors.service;

import com.idoctors.domain.Doctor;

/**
 * @author Shukri Shukriev
**/

public interface DoctorService {
	
	Iterable<Doctor> findAllDoctors();

	Doctor getDoctorById(Integer id);

	Integer saveDoctor(Doctor doctor);
	
	void deleteDoctorById(Integer id);
	
	Doctor updateDoctor(Doctor doctor);
}
