package com.example.demo.service.impl;

import com.example.demo.dao.DepartmentRepository;
import com.example.demo.dao.TeacherRepository;
import com.example.demo.domain.TeacherEntity;
import com.example.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService{

    @Autowired
    TeacherRepository teacherRepository;
    DepartmentRepository departmentRepository;

    @Override
    public TeacherEntity saveTeacher(TeacherEntity teacherEntity) {

        return teacherRepository.save(teacherEntity);
    }

    @Override
    public Boolean deleteTeacher(Long teacherId) {
        teacherRepository.deleteById(teacherId);
        return teacherRepository.existsById(teacherId)?false:true;
    }

    @Override
    public Iterable<TeacherEntity> returnAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Optional<TeacherEntity> returnById(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }


}
