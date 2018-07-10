package com.example.demo.domain;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="subjects")
public class SubjectEntity
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column (name="ects")
    private int ects;

    @ManyToMany
    @JoinColumn (name = "teacherId")
    private List<TeacherEntity> teacherEntities;

    public SubjectEntity() {
    }

    public SubjectEntity(String name, int ects, List<TeacherEntity> teacherEntities) {
        this.name = name;
        this.ects = ects;
        this.teacherEntities = teacherEntities;
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
}
