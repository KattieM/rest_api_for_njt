package com.example.demo.service.impl;

import com.example.demo.dao.SubjectModuleSemesterTypeRepository;
import com.example.demo.dao.SubjectRepository;
import com.example.demo.domain.SubjectEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeKey;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.SubjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {
    public static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public SubjectEntity saveSubject(SubjectEntity subjectEntity) {
//        SubjectEntity subjectEntity = new SubjectEntity(subjectDto.getName(), subjectDto.getEcts(), subjectDto.getTeacherEntities(), subjectDto.getLiteratureEntities());
//        logger.info(subjectDto.getEcts()+" "+subjectDto.getName()+" ");
//        SubjectEntity subEnt = subjectRepository.save(subjectEntity);
//        SubjectModuleSemesterTypeKey key = new SubjectModuleSemesterTypeKey(subjectDto.getModuleEntity(), subjectDto.getSemesterEnum(), subjectEntity, subjectDto.getSubjectTypeEnum());
//        logger.info(subjectDto.getModuleEntity().getModuleKey()+" "+subjectDto.getSemesterEnum()+" "+ subjectEntity+" "+ subjectDto.getSubjectTypeEnum());
//        SubjectModuleSemesterTypeEntity subjectModuleSemesterTypeEntity = subjectModuleSemesterTypeRepository.save(new SubjectModuleSemesterTypeEntity(key));
//        return subjectModuleSemesterTypeEntity;
        return subjectRepository.save(subjectEntity);

    }

    @Override
    public Iterable<SubjectEntity> returnAll() {
        return subjectRepository.findAll();
    }

//    @Override
//    public void deleteSubject(SubjectEntity subjectEntity) {
//        subjectRepository.delete(subjectEntity);
//    }

//    @Override
//    public Iterable<SubjectModuleSemesterTypeEntity> returnById() {
//        return subjectModuleSemesterTypeRepository.findAll();
//    }


}
