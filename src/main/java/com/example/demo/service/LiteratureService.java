package com.example.demo.service;

import com.example.demo.domain.AuthorEntity;
import com.example.demo.domain.LiteratureEntity;

import java.util.Optional;

public interface LiteratureService {
    public LiteratureEntity saveLiterature(LiteratureEntity literatureEntity);
    public Boolean deleteLiterature(Long literatureId) throws Exception;
    public Iterable<LiteratureEntity> returnAll();
    public Optional<LiteratureEntity> returnById(Long literatureId);

}
