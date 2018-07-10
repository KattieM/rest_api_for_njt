package com.example.demo.domain;

import javax.persistence.*;

@Entity
@Table(name = "studyPrograms")
public class StudyProgramEntity {
    @EmbeddedId
    private StudyProgramKey studyProgramKey;

    @Column (name = "studyProgram")
    private String name;

    public StudyProgramEntity() {
    }

    public StudyProgramEntity(StudyProgramKey studyProgramKey, String name) {
        this.studyProgramKey = studyProgramKey;
        this.name = name;
    }

    public StudyProgramKey getStudyProgramKey() {
        return studyProgramKey;
    }

    public void setStudyProgramKey(StudyProgramKey studyProgramKey) {
        this.studyProgramKey = studyProgramKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
