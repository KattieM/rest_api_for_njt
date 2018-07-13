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



}
