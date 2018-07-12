package com.example.demo.service;

import com.example.demo.domain.SubjectEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeKey;
import com.example.demo.dto.SubjectDto;

import java.util.Optional;

public interface SubjectModuleSemesterTypeService {
    public Boolean saveSubject(SubjectDto subjectDto);
    public Iterable<SubjectModuleSemesterTypeEntity> returnAll();

}
