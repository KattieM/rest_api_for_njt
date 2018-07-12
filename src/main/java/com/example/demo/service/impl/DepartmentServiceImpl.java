package com.example.demo.service.impl;

import com.example.demo.dao.DepartmentRepository;
import com.example.demo.domain.DepartmentEntity;
import com.example.demo.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DepartmentServiceImpl implements DepartmentService {

    public static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Autowired
    DepartmentRepository departmentRepository;

    /**
     * Method for saving department
     *
     * @param departmentEntity
     * @return
     */
    @Override
    public Boolean saveDepartment(DepartmentEntity departmentEntity) {
        Boolean success = false;
        try {
            logger.info("Started process saving dep. entity.");
            DepartmentEntity dpEntity = departmentRepository.save(departmentEntity);
            success = dpEntity == null ? false : true;
        } catch (Exception e) {
            logger.error("Error while saving dep. Entity with exception: ");
            e.printStackTrace();
        }

        return success;
    }

    @Override
    public Boolean deleteDepartment(Long departmentId) {
        try{
            departmentRepository.deleteById(departmentId);
            if(!departmentRepository.existsById(departmentId))
                return true;
        } catch (Exception ex){
            logger.error("Error while deleting requested department");
        }
        return false;

    }

    @Override
    public Iterable<DepartmentEntity> returnAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<DepartmentEntity> returnById(Long id) {
        return departmentRepository.findById(id);
    }
}
