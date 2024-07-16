package com.unla.stocksystem.controllers;

<<<<<<< HEAD
=======
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.stocksystem.helpers.ViewRouteHelper;

@Controller
public class UserController {

	@GetMapping("/login")
	public String login(Model model,
			@RequestParam(name="error", required=false) String error,
			@RequestParam(name="logout", required=false) String logout) {
		model.addAttribute("error", error);
		model.addAttribute("logout", logout);
		return ViewRouteHelper.USER_LOGIN;
	}

	@GetMapping("/logout")
	public String logout(Model model) {
		return ViewRouteHelper.USER_LOGOUT;
	}

	@GetMapping("/loginsuccess")
	public String loginCheck() {
		return "redirect:/index";
	}
}
=======

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
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
