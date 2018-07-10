package com.example.demo.domain;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class FacultyUniversityKey implements Serializable{
    @ManyToOne
    @JoinColumn(name = "universityId")
    private UniversityEntity universityEntity;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    public FacultyUniversityKey() {
    }

    public FacultyUniversityKey(UniversityEntity universityEntity) {
        this.universityEntity = universityEntity;
    }

    public UniversityEntity getUniversityEntity() {
        return universityEntity;
    }

    public void setUniversityEntity(UniversityEntity universityEntity) {
        this.universityEntity = universityEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
