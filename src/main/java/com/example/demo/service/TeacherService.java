package com.example.demo.service;

import com.example.demo.domain.TeacherEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface TeacherService {

    public TeacherEntity saveTeacher(TeacherEntity teacherEntity);
    public Boolean deleteTeacher(Long teacherId);
    public Iterable<TeacherEntity> returnAll();
    public Optional<TeacherEntity> returnById(Long teacherId);

}
