package com.unla.stocksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Esto se refiere a index.html en la carpeta templates
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Esto se refiere a login.html en la carpeta templates
    }

    @GetMapping("/record")
    public String registro() {
        return "record"; // Esto se refiere a registro.html en la carpeta templates
    }
}