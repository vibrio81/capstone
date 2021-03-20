package com.tts.capstone.service;

import com.tts.capstone.model.Volunteer;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface VolunteerService extends UserDetailsService {
    Iterable<Volunteer> getAllVolunteers();
    void addVolunteer(Volunteer volunteer);
    void deleteById(Long id);

}
