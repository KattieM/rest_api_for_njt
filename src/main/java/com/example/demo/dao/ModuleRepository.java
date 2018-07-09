package com.example.demo.dao;

import com.example.demo.domain.ModuleEntity;
import com.example.demo.domain.ModuleKey;
import org.springframework.data.repository.CrudRepository;

public interface ModuleRepository extends CrudRepository<ModuleEntity, ModuleKey> {
}
