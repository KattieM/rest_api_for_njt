package com.example.demo.dao;

import com.example.demo.domain.StudyProgramEntity;
import com.example.demo.domain.StudyProgramKey;
import org.springframework.data.repository.CrudRepository;

public interface StudyProgramRepository extends CrudRepository<StudyProgramEntity, StudyProgramKey> {
}
