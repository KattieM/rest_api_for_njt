package com.example.demo.dao;


import com.example.demo.domain.Credentials;
import org.springframework.data.repository.CrudRepository;

public interface CredentialsRepository extends CrudRepository<Credentials, Long> {
}
