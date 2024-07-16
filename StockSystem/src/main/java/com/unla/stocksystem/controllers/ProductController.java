package com.unla.stocksystem.controllers;

<<<<<<< HEAD
import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.service.ProductService;
import com.unla.stocksystem.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	private StockService stockService;

	public ProductController(ProductService productService, StockService stockService) {
		this.productService = productService;
		this.stockService = stockService;
	}

	@PostMapping
	public Product addProduct(@RequestBody Product product) {
		return productService.addProductToStock(product);
	}

	@GetMapping("/search")
	public List<Product> searchProducts(@RequestParam String keyword) {
		return productService.searchProducts(keyword);
	}
=======
public class ProductController {

>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
}
