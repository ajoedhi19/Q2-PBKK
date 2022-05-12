package com.syqu.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CollaborationController {

    @GetMapping("/collaboration")
    public String collaboration(Model model, String error){
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        return "collaboration";
    }
}