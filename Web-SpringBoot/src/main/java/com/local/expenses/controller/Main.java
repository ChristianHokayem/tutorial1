package com.local.expenses.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Main {
    @RequestMapping("/")
    public String hello(Model model) {
        model.addAttribute("name", "toto");
        model.addAttribute("text", "Hello, welcome to the site!");
        return "main";
    }

    @RequestMapping(params = "action1", value = "action")
    public String getButton(Model model) {
        model.addAttribute("name", "tata");
        return "main";
    }
}