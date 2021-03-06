package com.example.demo.domain;

import com.example.demo.domain.ModuleKey;

import javax.persistence.*;

@Entity
@Table(name = "modules")
public class ModuleEntity {
    @EmbeddedId
    private ModuleKey moduleKey;

    @Column(name = "name")
    private String name;

    public ModuleEntity() {
    }

    public ModuleEntity(ModuleKey moduleKey, String name) {
        this.moduleKey = moduleKey;
        this.name = name;
    }

    public ModuleKey getModuleKey() {
        return moduleKey;
    }

    public void setModuleKey(ModuleKey moduleKey) {
        this.moduleKey = moduleKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
