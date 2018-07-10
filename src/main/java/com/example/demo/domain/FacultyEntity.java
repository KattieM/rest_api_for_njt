package com.example.demo.domain;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="faculties")
public class FacultyEntity {
    @EmbeddedId
    private FacultyUniversityKey facultyUniversityKey;

    @Column (name = "facultyName")
    private String name;

    public FacultyEntity() {
    }

    public FacultyEntity(FacultyUniversityKey facultyUniversityKey, String name) {
        this.facultyUniversityKey = facultyUniversityKey;
        this.name = name;
    }

    public FacultyUniversityKey getFacultyUniversityKey() {
        return facultyUniversityKey;
    }

    public void setFacultyUniversityKey(FacultyUniversityKey facultyUniversityKey) {
        this.facultyUniversityKey = facultyUniversityKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
