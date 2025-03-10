package com.docencia.tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Welcome to Spring Boot");
        model.addAttribute("subtitle", "An Spring Boot Eafit App");
        return "home/index";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About Us - Online Store");
        model.addAttribute("subtitle", "About Us");
        model.addAttribute("description", "This is an about page ...");
        model.addAttribute("author", "Developed by: Juan Alberto");
        return "home/about";
    }

    @GetMapping("/contact")
    public String contact(Model model){
        model.addAttribute("title", "Contact information - Online Store");
        model.addAttribute("subtitle", "Here is the following information if you have to contact us");
        model.addAttribute("email", "jrodriguez0107@gmail.com");
        model.addAttribute("address", "Calle 771 # 44-292");
        model.addAttribute("phone", "380 321 9897");
        return "home/contact";
    }

}