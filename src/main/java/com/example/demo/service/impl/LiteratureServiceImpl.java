package com.example.demo.service.impl;

import com.example.demo.dao.LiteratureRepository;
import com.example.demo.domain.LiteratureEntity;
import com.example.demo.service.LiteratureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class LiteratureServiceImpl implements LiteratureService{
    @Autowired
    LiteratureRepository literatureRepository;

    @Override
    public Boolean saveLiterature(LiteratureEntity literatureEntity) {
         LiteratureEntity litEnt = literatureRepository.save(literatureEntity);
         if(litEnt!=null)
             return true;
         return false;
    }

    @Override
    public Boolean deleteLiterature(Long literatureId) {
        literatureRepository.deleteById(literatureId);
        return !literatureRepository.existsById(literatureId);
    }

    @Override
    public Iterable<LiteratureEntity> returnAll() {
        return literatureRepository.findAll();
    }

    @Override
    public Optional<LiteratureEntity> returnById(Long literatureId){
        return literatureRepository.findById(literatureId);
    }
}
