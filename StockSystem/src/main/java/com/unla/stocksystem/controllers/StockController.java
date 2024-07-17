
package com.unla.stocksystem.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.unla.stocksystem.helpers.ViewRouteHelper;
import com.unla.stocksystem.service.IStockService;

@Controller
@RequestMapping("/stock")
public class StockController {

	private IStockService stockService;

	public StockController(IStockService stockService) {
		this.stockService = stockService;
	}

	@GetMapping("")
	public ModelAndView stock() {

		ModelAndView mav = new ModelAndView();

		// Obteniene la información de autenticación del contexto de seguridad
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		// Verifica si el usuario tiene el rol ROLE_ADMIN
		boolean isAdmin = auth != null
				&& auth.getAuthorities().stream().anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));

		if (isAdmin) {
			mav.setViewName(ViewRouteHelper.STOCK);
			mav.addObject("stocks", stockService.getAll());
		} else {
			// Si no es administrador, redirigir a la página de no administrador
			mav.setView(new RedirectView(ViewRouteHelper.NOT_ADMIN));
		}

		return mav;
	}
}
