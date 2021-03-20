package com.tts.capstone.repository;

import com.tts.capstone.model.Volunteer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface VolunteerRepository extends CrudRepository<Volunteer, Long> {

    Optional<Volunteer> findByEmail(String email);
    Volunteer findByUsername(String username);
}
