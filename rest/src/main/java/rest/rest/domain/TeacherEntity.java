package rest.rest.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name="teachers")
public class TeacherEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name = "email")
    private String email;

    @Column (name = "phone")
    private String phone;

    @Column (name = "dateOfHiring")
    private Date dateOfHiring;

    @Column (name = "vocation")
    @Enumerated(EnumType.STRING)
    private VocationEnum vocationEnum;

    @ManyToOne
    private DepartmentEntity departmentEntity;


    public TeacherEntity() {
    }

    public TeacherEntity(String name, String surname, String email, String phone, Date dateOfHiring, VocationEnum vocationEnum) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.dateOfHiring = dateOfHiring;
        this.vocationEnum = vocationEnum;
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


}
