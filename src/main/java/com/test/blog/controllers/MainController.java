package com.test.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title", "Hello World!");
        return "home";
    }

    @GetMapping("/about")
    public String AboutMain(Model model) {
        model.addAttribute("title", "Hello World!");
        return "about";
    }

}