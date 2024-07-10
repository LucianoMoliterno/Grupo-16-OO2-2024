package com.unla.stocksystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.unla.stocksystem.services.ProductService;

public class UserController {
	@Controller
	@RequestMapping("/user")
	public class UserrController {
	    @Autowired
	    private ProductService productService;

	    @GetMapping("/catalogo")
	    public String showCatalog(Model model) {
	        model.addAttribute("products", productService.getAllProducts());
	        return "user/catalogue";
	    }

	    // Agregar otros métodos relacionados con el usuario
	}
}
