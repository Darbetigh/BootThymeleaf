package com.example.thymeleaf.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private String message = "its a simple message! ";
    private String message2 = "its a simple message! ";

    @RequestMapping(value = {"/", "index"})
    public String index(Model model) {
        model.addAttribute("messageTag", message);
        model.addAttribute("messageTag2", message2);
        return "index";
    }
}