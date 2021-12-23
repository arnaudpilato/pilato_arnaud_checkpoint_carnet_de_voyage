package com.wildcodeschool.checkpoint_carnet_de_voyage.controller;

import com.wildcodeschool.checkpoint_carnet_de_voyage.Repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @Autowired
    private TravelRepository travelRepository;

    @GetMapping("/")
    public String index(Model model) {

        return "/index";
    }
}
