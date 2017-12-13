package com.idoctors.repository;

import org.springframework.data.repository.CrudRepository;

import com.idoctors.domain.University;


public interface UniversityRepository extends CrudRepository<University, Integer> {
}
