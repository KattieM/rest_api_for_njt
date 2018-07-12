package com.example.demo.domain;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Embeddable
public class SubjectModuleSemesterTypeKey implements Serializable{

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "degreeOfStudyID"),
            @JoinColumn(name = "studyProgramID"),
            @JoinColumn(name = "moduleId")
    })
    private ModuleEntity moduleEntity;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SemesterEnum semesterEnum;

    @ManyToOne
    @JoinColumn(name="subjectId")
    private SubjectEntity subjectEntity;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SubjectTypeEnum subjectTypeEnum;

    public SubjectModuleSemesterTypeKey() {
    }

    public SubjectModuleSemesterTypeKey(ModuleEntity moduleEntity, @NotNull SemesterEnum semesterEnum, SubjectEntity subjectEntity, @NotNull SubjectTypeEnum subjectTypeEnum) {
        this.moduleEntity = moduleEntity;
        this.semesterEnum = semesterEnum;
        this.subjectEntity = subjectEntity;
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

    public SubjectEntity getSubjectEntity() {
        return subjectEntity;
    }

    public void setSubjectEntity(SubjectEntity subjectEntity) {
        this.subjectEntity = subjectEntity;
    }

    public SubjectTypeEnum getSubjectTypeEnum() {
        return subjectTypeEnum;
    }

    public void setSubjectTypeEnum(SubjectTypeEnum subjectTypeEnum) {
        this.subjectTypeEnum = subjectTypeEnum;
    }
}

