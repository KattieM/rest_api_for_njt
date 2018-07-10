package com.example.demo.dao;

import com.example.demo.domain.ThesisEntity;
import org.springframework.data.repository.CrudRepository;

public interface ThesisRepository extends CrudRepository<ThesisEntity, Long>{
}
