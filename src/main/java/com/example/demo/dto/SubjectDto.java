package com.example.demo.dto;

import com.example.demo.domain.*;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

public class SubjectDto {
    private Long id;
    private String name;
    private int ects;
    private List<TeacherEntity> teacherEntities;
    private List<LiteratureEntity> literatureEntities;
    private SubjectTypeEnum subjectTypeEnum;
    private ModuleEntity moduleEntity;
    private SemesterEnum semesterEnum;

    public SubjectDto() {
    }

    public SubjectDto(Long id, String name, int ects, List<TeacherEntity> teacherEntities, List<LiteratureEntity> literatureEntities, SubjectTypeEnum subjectTypeEnum, ModuleEntity moduleEntity, SemesterEnum semesterEnum) {
        this.id = id;
        this.name = name;
        this.ects = ects;
        this.teacherEntities = teacherEntities;
        this.literatureEntities = literatureEntities;
        this.subjectTypeEnum = subjectTypeEnum;
        this.moduleEntity = moduleEntity;
        this.semesterEnum = semesterEnum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public List<TeacherEntity> getTeacherEntities() {
        return teacherEntities;
    }

    public void setTeacherEntities(List<TeacherEntity> teacherEntities) {
        this.teacherEntities = teacherEntities;
    }

    public List<LiteratureEntity> getLiteratureEntities() {
        return literatureEntities;
    }

    public void setLiteratureEntities(List<LiteratureEntity> literatureEntities) {
        this.literatureEntities = literatureEntities;
    }

    public SubjectTypeEnum getSubjectTypeEnum() {
        return subjectTypeEnum;
    }

    public void setSubjectTypeEnum(SubjectTypeEnum subjectTypeEnum) {
        this.subjectTypeEnum = subjectTypeEnum;
    }

    public ModuleEntity getModuleEntity() {
        return moduleEntity;
    }

    public void setModuleEntity(ModuleEntity moduleEntity) {
        this.moduleEntity = moduleEntity;
    }

    public SemesterEnum getSemesterEnum() {
        return semesterEnum;
    }

    public void setSemesterEnum(SemesterEnum semesterEnum) {
        this.semesterEnum = semesterEnum;
    }
}
