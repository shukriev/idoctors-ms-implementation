package com.idoctors.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idoctors.domain.Doctor;
import com.idoctors.repository.DoctorRepository;
import com.idoctors.service.DoctorService;

/**
 * @author Shukri Shukriev
**/

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public Iterable<Doctor> findAllDoctors() {
		return doctorRepository.findAll();
	}

	@Override
	public Doctor getDoctorById(Integer id) {
		return doctorRepository.findOne(id);
	}

	@Override
	public Integer saveDoctor(Doctor doctor) {
		return doctorRepository.save(doctor).getId();
	}

	@Override
	public void deleteDoctorById(Integer id) {
		doctorRepository.delete(id);
	}

	@Override
	public Doctor updateDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
	}

}
