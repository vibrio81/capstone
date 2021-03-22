package com.tts.capstone.service;

import com.tts.capstone.model.Admin;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AdminService extends UserDetailsService {

    Iterable<Admin> getAllAdmin();
    void addAdmin(Admin admin);
    void deleteById(Long id);

}