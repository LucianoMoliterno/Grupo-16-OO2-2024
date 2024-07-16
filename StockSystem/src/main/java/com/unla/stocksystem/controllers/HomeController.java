package com.unla.stocksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.stocksystem.helpers.UserUtil;
import com.unla.stocksystem.helpers.ViewRouteHelper;
@Controller
@RequestMapping("/")
public class HomeController {

	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.INDEX);
		modelAndView.addObject("isAdmin", UserUtil.isRol(UserUtil.ROLE_ADMIN));
		return modelAndView;
	}

	@GetMapping("/hello")
	public ModelAndView helloParams1(@RequestParam(name="name", required=false, defaultValue="null") String name) {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.HELLO);
		mV.addObject("name", name);
		return mV;
	}

	@GetMapping("/hello/{name}")
	public ModelAndView helloParams2(@PathVariable("name") String name) {
		ModelAndView mV = new ModelAndView(ViewRouteHelper.HELLO);
		mV.addObject("name", name);
		return mV;
	}

	@GetMapping("/")
	public RedirectView redirectToHomeIndex() {
		return new RedirectView(ViewRouteHelper.ROUTE);
}
	 
=======

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
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
}