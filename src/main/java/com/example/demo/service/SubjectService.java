package com.example.demo.service;

import com.example.demo.domain.SubjectEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeKey;
import com.example.demo.dto.SubjectDto;

import java.util.Optional;

public interface SubjectService {
    public SubjectEntity saveSubject(SubjectEntity subjectEntity);
    public Iterable<SubjectEntity> returnAll();
//    public void deleteSubject(SubjectEntity subjectEntity);

}
