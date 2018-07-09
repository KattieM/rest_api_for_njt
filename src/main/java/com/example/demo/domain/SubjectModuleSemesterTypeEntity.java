package com.example.demo.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "subjectInSemester")
public class SubjectModuleSemesterTypeEntity {
    @EmbeddedId
    private SubjectModuleSemesterTypeKey semesterTypeKey;

    public SubjectModuleSemesterTypeEntity(SubjectModuleSemesterTypeKey semesterTypeKey) {
        this.semesterTypeKey = semesterTypeKey;
    }

    public SubjectModuleSemesterTypeEntity() {
    }

    public SubjectModuleSemesterTypeKey getSemesterTypeKey() {
        return semesterTypeKey;
    }

    public void setSemesterTypeKey(SubjectModuleSemesterTypeKey semesterTypeKey) {
        this.semesterTypeKey = semesterTypeKey;
    }
}
