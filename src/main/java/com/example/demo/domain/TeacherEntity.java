package com.example.demo.domain;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table (name="teachers")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @JsonProperty("id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;


    @Column(name = "email")
    private String email;

    @Column (name = "phone", length = 10)
    private String phone;

    @Column (name = "dateOfHiring")
    private Date dateOfHiring;

//    @ElementCollection(targetClass = VocationEnum.class)
//    @JoinTable(name = "vocations", joinColumns = @JoinColumn(name = "id"))
    @Column (name = "vocation")
    @Enumerated(EnumType.STRING)
    private VocationEnum vocationEnum;

    @ManyToOne
    @JoinColumn(name = "department_Id")
    private DepartmentEntity departmentEntity;

    public TeacherEntity() {
    }

    public TeacherEntity(String name, String surname, String email, String phone, Date dateOfHiring, VocationEnum vocationEnum, DepartmentEntity departmentEntity) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.dateOfHiring = dateOfHiring;
        this.vocationEnum = vocationEnum;
        this.departmentEntity = departmentEntity;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getDateOfHiring() {
        return dateOfHiring;
    }

    public void setDateOfHiring(Date dateOfHiring) {
        this.dateOfHiring = dateOfHiring;
    }

    public VocationEnum getVocationEnum() {
        return vocationEnum;
    }

    public void setVocationEnum(VocationEnum vocationEnum) {
        this.vocationEnum = vocationEnum;
    }

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }
}
