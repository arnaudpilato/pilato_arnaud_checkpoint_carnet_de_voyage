package com.wildcodeschool.checkpoint_carnet_de_voyage.controller;

import com.wildcodeschool.checkpoint_carnet_de_voyage.Entity.Travel;
import com.wildcodeschool.checkpoint_carnet_de_voyage.Repository.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarnetController {
    @Autowired
    private TravelRepository travelRepository;

    @GetMapping("/travel")
    public String getTravel(Model model, @RequestParam(required = false) Long id) {

        Travel travel = new Travel();
        if (id != null) {
            travel = travelRepository.getById(id);
        }
        model.addAttribute("wizard", travel);

        return "/travel";
    }

    @PostMapping("/travel")
    public String postTravel(@ModelAttribute Travel travel) {
        travelRepository.save(travel);

        return "redirect:/travel";


    }

    @GetMapping("/wizard/delete")
    public String deleteTravel(@RequestParam Long id) {

        travelRepository.deleteById(id);

        return "redirect:/index";
    }
}
