package com.tts.capstone.repository;

import com.tts.capstone.model.Donate;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DonateRepository extends CrudRepository<Donate, Long> {
}