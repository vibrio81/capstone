package com.tts.capstone.service;

import com.tts.capstone.model.Donate;
import com.tts.capstone.repository.DonateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonationServiceImpl implements DonateService {
    @Autowired
    private DonateRepository donateRepository;


    @Override
    public Iterable<Donate> getAllDonate() {

        return donateRepository.findAll();

    }

    @Override
    public void addDonate(Donate donate) {
        donate.setFirstName(donate.getFirstName());
        donate.setLastName(donate.getLastName());
        donate.setAmount(donate.getAmount());
        donate.setDonorNotes(donate.getDonorNotes());
        donate.setEmail(donate.getEmail());
        donate.setPhoneNumber(donate.getPhoneNumber());
        donate.setStreet(donate.getStreet());
        donate.setCity(donate.getCity());
        donate.setState(donate.getState());
        donate.setZipCode(donate.getZipCode());

        donateRepository.save(donate);


    }

    @Override
    public void deleteById(Long id) {

    }
}