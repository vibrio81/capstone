package com.tts.capstone.repository;

import com.tts.capstone.model.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface AdminRepository extends CrudRepository<Admin,Long> {

    Optional<Admin> findByEmail(String email);
    Admin findByUsername(String username);
}