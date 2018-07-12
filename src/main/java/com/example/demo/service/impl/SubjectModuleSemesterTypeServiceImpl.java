package com.example.demo.service.impl;

import com.example.demo.dao.SubjectModuleSemesterTypeRepository;
import com.example.demo.dao.SubjectRepository;
import com.example.demo.domain.ModuleEntity;
import com.example.demo.domain.SubjectEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeEntity;
import com.example.demo.domain.SubjectModuleSemesterTypeKey;
import com.example.demo.dto.SubjectDto;
import com.example.demo.service.SubjectModuleSemesterTypeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class SubjectModuleSemesterTypeServiceImpl implements SubjectModuleSemesterTypeService{
    public static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
    @Autowired
    SubjectModuleSemesterTypeRepository subjectModuleSemesterTypeRepository;
    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public Boolean saveSubject(SubjectDto subjectDto) {
        SubjectEntity subjectEntity = new SubjectEntity(subjectDto.getName(), subjectDto.getEcts(), subjectDto.getTeacherEntities(), subjectDto.getLiteratureEntities());
        logger.info(subjectDto.getEcts()+" "+subjectDto.getName()+" ");
        SubjectEntity subEnt = subjectRepository.save(subjectEntity);
        SubjectModuleSemesterTypeKey key = new SubjectModuleSemesterTypeKey(subjectDto.getModuleEntity(), subjectDto.getSemesterEnum(), subjectEntity, subjectDto.getSubjectTypeEnum());
        logger.info(subjectDto.getModuleEntity().getModuleKey()+" "+subjectDto.getSemesterEnum()+" "+ subjectEntity+" "+ subjectDto.getSubjectTypeEnum());
        SubjectModuleSemesterTypeEntity subjectModuleSemesterTypeEntity = subjectModuleSemesterTypeRepository.save(new SubjectModuleSemesterTypeEntity(key));
        if(subEnt!=null && subjectModuleSemesterTypeEntity!=null)
            return true;
        return false;

    }

    @Override
    public Iterable<SubjectModuleSemesterTypeEntity> returnAll() {
        return subjectModuleSemesterTypeRepository.findAll();
    }

//    @Override
//    public Iterable<SubjectModuleSemesterTypeEntity> returnById() {
//        return subjectModuleSemesterTypeRepository.findAll();
//    }


}
