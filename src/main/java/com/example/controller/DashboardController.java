package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        model.addAttribute("title", "My Professional Dashboard");
        model.addAttribute("message", "Welcome to my professional portfolio!");
        model.addAttribute("name", "Shreenivasa Y G");
        model.addAttribute("photoUrl", "/images/shreeni.jpg");
        model.addAttribute("experience", new String[]{
            "Devops and MLops Engineer at Hexaware (2020 - Present)",
            "Cloud and Devops engineer JMJ groups (2013 - 2020)",
            "Bachelor's Degree in Computer Science from University C (2007 - 2011)"
        });
        return "dashboard";
    }
}
