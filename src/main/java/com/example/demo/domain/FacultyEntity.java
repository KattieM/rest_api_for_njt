package com.example.demo.domain;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="faculties")
public class FacultyEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column (name = "facultyName")
    private String name;

    @ManyToOne
    @JoinColumn (name = "universityID")
    private UniversityEntity universityEntity;


    public FacultyEntity() {

    }

    public FacultyEntity(String name, UniversityEntity universityEntity) {
        this.name = name;
        this.universityEntity = universityEntity;
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

    public UniversityEntity getUniversityEntity() {
        return universityEntity;
    }

    public void setUniversityEntity(UniversityEntity universityEntity) {
        this.universityEntity = universityEntity;
    }
}
