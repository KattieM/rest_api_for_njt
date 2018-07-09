package com.example.demo.domain;
import javax.persistence.*;

@Entity
@Table(name = "degreesOfStudy")
public class DegreeOfStudyEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String title;

    public DegreeOfStudyEntity() {
    }

    public DegreeOfStudyEntity(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
