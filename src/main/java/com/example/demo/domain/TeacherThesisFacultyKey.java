package com.example.demo.domain;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class TeacherThesisFacultyKey implements Serializable{

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "universityId"),
            @JoinColumn(name = "facultyId")
    })
    private FacultyEntity facultyEntity;

    @ManyToOne
    @JoinColumn(name = "teacherId")
    private TeacherEntity teacherEntity;

    @ManyToOne
    @JoinColumn (name = "thesisId")
    private ThesisEntity thesisEntity;

    public TeacherThesisFacultyKey() {
    }

    public TeacherThesisFacultyKey(FacultyEntity facultyEntity, TeacherEntity teacherEntity, ThesisEntity thesisEntity) {
        this.facultyEntity = facultyEntity;
        this.teacherEntity = teacherEntity;
        this.thesisEntity = thesisEntity;
    }

    public FacultyEntity getFacultyEntity() {
        return facultyEntity;
    }

    public void setFacultyEntity(FacultyEntity facultyEntity) {
        this.facultyEntity = facultyEntity;
    }

    public TeacherEntity getTeacherEntity() {
        return teacherEntity;
    }

    public void setTeacherEntity(TeacherEntity teacherEntity) {
        this.teacherEntity = teacherEntity;
    }

    public ThesisEntity getThesisEntity() {
        return thesisEntity;
    }

    public void setThesisEntity(ThesisEntity thesisEntity) {
        this.thesisEntity = thesisEntity;
    }
}
