package com.example.demo.dao;

import com.example.demo.domain.UniversityEntity;
import org.springframework.data.repository.CrudRepository;

public interface UniversityRepository extends CrudRepository<UniversityEntity, Long> {
}
