package com.scm.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home page handler");

        // Sending data to view
        model.addAttribute("name", "Smart contact manager");
        model.addAttribute("youtubechannel", "Smart contact manager");
        return "home";
    }
}
