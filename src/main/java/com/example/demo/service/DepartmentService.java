package com.example.demo.service;
import com.example.demo.domain.DepartmentEntity;

import java.util.List;
import java.util.Optional;

public interface DepartmentService {

    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) throws Exception;
    public Boolean deleteDepartment(Long departmentId) throws Exception;
    public Iterable<DepartmentEntity> returnAll();
    public Optional<DepartmentEntity> returnById(Long id);
}
