package com.example.demo.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class ModuleKey implements Serializable{
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "degreeOfStudyId"),
            @JoinColumn(name = "studyProgramId")
    })
    private StudyProgramEntity studyProgramEntity;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column (name = "id")
    private Long id;

    public ModuleKey() {
    }

    public ModuleKey(StudyProgramEntity studyProgramEntity) {
        this.studyProgramEntity = studyProgramEntity;
    }

    public StudyProgramEntity getStudyProgramEntity() {
        return studyProgramEntity;
    }

    public void setStudyProgramEntity(StudyProgramEntity studyProgramEntity) {
        this.studyProgramEntity = studyProgramEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
