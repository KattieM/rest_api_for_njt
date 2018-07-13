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
    public LiteratureEntity saveLiterature(LiteratureEntity literatureEntity) {
        System.out.println(literatureEntity.getAuthorEntities());
         return literatureRepository.save(literatureEntity);

    }

    @Override
    public Boolean deleteLiterature(Long literatureId) throws Exception {
        literatureRepository.deleteById(literatureId);
        if(!literatureRepository.existsById(literatureId))
            return true;
        else
            throw new Exception();
        //return literatureRepository.existsById(literatureId);
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
