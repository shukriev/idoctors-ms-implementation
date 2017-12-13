package com.idoctors.repository;

import org.springframework.data.repository.CrudRepository;

import com.idoctors.domain.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Integer> {
}
