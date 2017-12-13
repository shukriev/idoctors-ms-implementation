package com.idoctors.service;

import java.util.List;

import com.idoctors.domain.DoctorSpeciality;

/**
 * @author Shukri Shukriev
**/

public interface DoctorSpecialityService {
	
	DoctorSpeciality findDoctorSpecialityByDoctorId(Integer doctorId);
	
	List<DoctorSpeciality> findAllDoctorSpecialityByDoctorId(Integer doctorId);
	
	void deleteDoctorSpecialityById(Integer id);
	
	DoctorSpeciality saveDoctorSpeciality(DoctorSpeciality doctorSpeciality);
}
