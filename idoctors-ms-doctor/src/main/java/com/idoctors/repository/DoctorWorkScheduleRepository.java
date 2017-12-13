package com.idoctors.repository;

import org.springframework.data.repository.CrudRepository;

import com.idoctors.domain.DoctorWorkSchedule;

public interface DoctorWorkScheduleRepository extends CrudRepository<DoctorWorkSchedule, Integer> {
}
