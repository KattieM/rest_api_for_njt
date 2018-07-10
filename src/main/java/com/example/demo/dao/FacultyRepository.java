package com.example.demo.dao;

import com.example.demo.domain.FacultyEntity;
import com.example.demo.domain.FacultyUniversityKey;
import org.springframework.data.repository.CrudRepository;

public interface FacultyRepository extends CrudRepository<FacultyEntity, FacultyUniversityKey>{
}
