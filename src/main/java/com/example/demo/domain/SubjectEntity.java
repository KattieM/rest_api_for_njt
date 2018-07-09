package com.example.demo.domain;


import javax.persistence.*;

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

    @ManyToOne
    @JoinColumn (name = "departmentID")
    private DepartmentEntity departmentEntity;

//    @ManyToMany
//    private ModuleEntity moduleEntity;
//
//    @ManyToMany
//    private SemesterEnum semesterEnum;
//
//    @ManyToMany
//    private SubjectTypeEnum subjectTypeEnum;
//
//    @ManyToMany
//    private TeacherEntity teacherEntity;

    public SubjectEntity() {
    }

    public SubjectEntity(String name, int ects) {
        this.name = name;
        this.ects = ects;
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

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }
}
