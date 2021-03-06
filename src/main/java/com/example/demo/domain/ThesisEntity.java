package com.example.demo.domain;
import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "thesis")
public class ThesisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "thesisName")
    private String name;

    public ThesisEntity() {

    }

    public ThesisEntity(String name) {
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
