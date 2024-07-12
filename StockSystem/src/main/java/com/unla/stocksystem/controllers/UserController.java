package com.unla.stocksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.stocksystem.helpers.ViewRouteHelper;

@Controller
@RequestMapping("/login")
public class UserController {
	@GetMapping("/login")
	public ModelAndView login(@RequestParam(name = "error", required = false) String error,
			@RequestParam(name = "logout", required = false) String logout) {
		ModelAndView modelAndView = new ModelAndView(ViewRouteHelper.USER_LOGIN);
		modelAndView.addObject("error", error);
		modelAndView.addObject("logout", logout);
		return modelAndView;
	}

	/*@GetMapping("/loginsuccess")
	public RedirectView loginCheck() {
		return new RedirectView(ViewRouteHelper.INDEX);
	}

	@GetMapping("/logout")
	public RedirectView logout() {
		return new RedirectView(ViewRouteHelper.LOGOUT_SUCCESS);
	}

	@GetMapping("/logoutsuccess")
	public ModelAndView logoutSuccess() {
		return new ModelAndView(ViewRouteHelper.USER_LOGOUT);
	}*/
}
