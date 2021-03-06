package com.example.demo.service.impl;

import com.example.demo.dao.DepartmentRepository;
import com.example.demo.domain.DepartmentEntity;
import com.example.demo.service.DepartmentService;
import jdk.nashorn.internal.ir.debug.JSONWriter;
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

    @Override
    public DepartmentEntity saveDepartment(DepartmentEntity departmentEntity) throws Exception {
        Boolean success = false;
        DepartmentEntity dpEntity = null;
        try {
            logger.info("Started process saving dep. entity.");
            dpEntity = departmentRepository.save(departmentEntity);
        } catch (Exception e) {
            logger.error("Error while saving dep. Entity with exception: ");
            e.printStackTrace();
        }
        if(dpEntity!=null)
            return dpEntity;
        else {
            throw new Exception();
        }
    }

    @Override
    public Boolean deleteDepartment(Long departmentId) throws Exception {
        try{
            logger.info(departmentId+"");
            departmentRepository.deleteById(departmentId);
            if(!departmentRepository.existsById(departmentId))
                return true;
        } catch (Exception ex){
            logger.error("Error while deleting requested department");
throw new Exception();

        }
        return false;

    }

    @Override
    public Iterable<DepartmentEntity> returnAll() {
        return departmentRepository.findAll();
    }

    @Override
    public Optional<DepartmentEntity> returnById(Long id){
        return departmentRepository.findById(id);

    }
}
