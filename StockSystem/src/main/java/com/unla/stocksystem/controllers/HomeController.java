package com.unla.stocksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.stocksystem.helpers.ViewRouteHelper;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("/index")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.HOME_INDEX);
		modelAndView.addObject("isAdmin", UserUtil.isRol(UserUtil.ROLE_ADMIN));
		return modelAndView;
	}

	@GetMapping("/")
	public RedirectView redirectHome() {
		return new RedirectView(ViewRouteHelper.INDEX);
	}
}
