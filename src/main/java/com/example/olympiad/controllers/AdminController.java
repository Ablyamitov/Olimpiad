package com.example.olympiad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/surprise")
    public String surprise(Model model){
        model.addAttribute("message", "Герман Русланович");
        return "surprise";
    }
}
