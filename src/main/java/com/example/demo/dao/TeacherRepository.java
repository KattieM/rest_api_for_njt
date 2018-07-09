package com.example.demo.dao;

import com.example.demo.domain.TeacherEntity;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<TeacherEntity, Long>{
}
