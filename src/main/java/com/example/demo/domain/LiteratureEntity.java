package com.example.demo.domain;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "literature")
public class LiteratureEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column (name = "literatureName")
    private String name;

    @Column(name = "isbn")
    private String isbn;
    @ManyToMany
    @Cascade(org.hibernate.annotations.CascadeType.ALL)
    private List<AuthorEntity> authorEntities;


    public LiteratureEntity() {
    }

    public LiteratureEntity(String name, String isbn, List<AuthorEntity> authorEntities) {
        this.name = name;
        this.isbn = isbn;
        this.authorEntities = authorEntities;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<AuthorEntity> getAuthorEntities() {
        return authorEntities;
    }

    public void setAuthorEntities(List<AuthorEntity> authorEntities) {
        this.authorEntities = authorEntities;
    }
}
