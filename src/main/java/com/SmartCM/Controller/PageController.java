package com.SmartCM.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String firstMethod(Model model){
        System.out.println("Home page helping to handle the project");
        model.addAttribute("Full name", "Mohammad Sarfuddin");
        model.addAttribute("email", "mohammad1914@gmail.com");
        model.addAttribute("githubRepository", "https://github.com/dashboard");
        return "home";
    }
}