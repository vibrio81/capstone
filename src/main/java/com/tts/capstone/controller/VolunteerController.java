package com.tts.capstone.controller;

import com.tts.capstone.model.Volunteer;
import com.tts.capstone.service.VolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VolunteerController {
    @Autowired
    private VolunteerService volunteerService;

    @GetMapping("/volunteer")
    public String show(Model model){
        model.addAttribute("volunteer", new Volunteer());
        return "volunteer";
    }

    @RequestMapping(value = "/volunteer/new", method = {RequestMethod.GET, RequestMethod.POST})
    public void register(@ModelAttribute Volunteer volunteer, Model model){
        model.addAttribute("name", volunteer.getName());
        model.addAttribute("dob", volunteer.getDob());
        model.addAttribute("phone", volunteer.getPhone());
        model.addAttribute("email", volunteer.getEmail());
        model.addAttribute("address", volunteer.getAddress());
        //model.addAttribute("volunteeringFor", volunteer.getVolunteeringFor());
        volunteerService.addVolunteer(volunteer);
    }

}
