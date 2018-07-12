package com.example.demo.dao;

import com.example.demo.domain.LiteratureEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LiteratureRepository extends CrudRepository<LiteratureEntity, Long>{
}
