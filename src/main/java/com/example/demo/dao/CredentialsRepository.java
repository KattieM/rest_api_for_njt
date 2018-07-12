package com.example.demo.dao;


import com.example.demo.domain.Credentials;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CredentialsRepository extends CrudRepository<Credentials, Long> {
    public Credentials findByUsername(@Param("username") String username);
}
