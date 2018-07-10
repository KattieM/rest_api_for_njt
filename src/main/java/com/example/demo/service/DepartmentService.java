package com.example.demo.service;
import com.example.demo.domain.DepartmentEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public Boolean saveDepartment(DepartmentEntity departmentEntity);
    public Boolean deleteDepartment(Long departmentId);
    public Iterable<DepartmentEntity> returnAll();
    public Optional<DepartmentEntity> returnById(Long id);
}
