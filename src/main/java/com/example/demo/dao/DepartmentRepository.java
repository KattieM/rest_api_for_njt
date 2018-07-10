package com.example.demo.dao;

import com.example.demo.domain.DepartmentEntity;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<DepartmentEntity, Long>{

}
