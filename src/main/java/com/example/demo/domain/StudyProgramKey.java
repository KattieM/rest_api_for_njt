package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class StudyProgramKey implements Serializable {
    @ManyToOne
    @JoinColumn(name = "degreeOfStudyID")
    private DegreeOfStudyEntity degreeOfStudyEntity;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public StudyProgramKey() {
    }

    public StudyProgramKey(DegreeOfStudyEntity degreeOfStudyEntity, Long id) {
        this.degreeOfStudyEntity = degreeOfStudyEntity;
        this.id = id;
    }

    public DegreeOfStudyEntity getDegreeOfStudyEntity() {
        return degreeOfStudyEntity;
    }

    public void setDegreeOfStudyEntity(DegreeOfStudyEntity degreeOfStudyEntity) {
        this.degreeOfStudyEntity = degreeOfStudyEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
