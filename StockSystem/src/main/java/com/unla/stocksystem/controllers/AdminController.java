package com.unla.stocksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@GetMapping("/panel")
	public String panel() {
		return "admin/panel";
	}

	@GetMapping("/add-product")
	public String addProduct() {
		return "admin/add-product";
	}

	@GetMapping("/manage-stock")
	public String manageStock() {
		return "admin/manage-stock";
	}

	@GetMapping("/view-customers")
	public String viewCustomers() {
		return "admin/view-customers";
	}

	@GetMapping("/create-supply-order")
	public String createSupplyOrder() {
		return "admin/create-supply-order";
	}
}