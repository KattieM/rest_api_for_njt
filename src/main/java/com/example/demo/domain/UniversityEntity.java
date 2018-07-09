package com.example.demo.domain;
import javax.persistence.*;

@Entity
@Table (name="universities")
public class UniversityEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    @Column (name = "universityName")
    private String name;

    public UniversityEntity() {
    }

    public UniversityEntity(String name) {
        this.name = name;
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
}
