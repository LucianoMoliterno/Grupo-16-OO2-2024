package com.unla.stocksystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.entity.Stock;
import com.unla.stocksystem.helpers.ViewRouteHelper;
import com.unla.stocksystem.service.IProductService;
import com.unla.stocksystem.service.IStockService;
import java.util.Optional;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/product")
public class ProductController {

	private IProductService productoService;
	private IStockService stockService;

	

	public ProductController(IProductService productoService, IStockService stockService) {
		super();
		this.productoService = productoService;
		this.stockService = stockService;
	}

	@GetMapping("")
	public ModelAndView product() {

		ModelAndView mav = new ModelAndView();

		Authentication auth = SecurityContextHolder.getContext().getAuthentication();

		// Verifica si es = ROLE_ADMIN
		boolean isAdmin = auth != null
				&& auth.getAuthorities().stream().anyMatch(role -> role.getAuthority().equals("ROLE_ADMIN"));

		if (isAdmin) {
			mav.setViewName(ViewRouteHelper.PRODUCTO);
			mav.addObject("productos", productoService.getAll());
		} else {
			// SI es usuario normal lo redirige a otra pagina
			mav.setView(new RedirectView(ViewRouteHelper.NOT_ADMIN));
		}

		return mav;
	}

	@GetMapping("/new")
	public ModelAndView create() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_NEW);
		mAV.addObject("producto", new Product());
		return mAV;
	}

	@PostMapping("/create")
	public RedirectView create(@ModelAttribute("producto") Product product,
			@RequestParam("quantityMin") int quantityMin) {
		productoService.insertOrUpdate(product);
		Stock s = new Stock(0, quantityMin,product);
		stockService.insertOrUpdate(s);
		return new RedirectView(ViewRouteHelper.PRODUCTO_ROOT);
	}

	@GetMapping("{id}")
	public ModelAndView get(@PathVariable("id") int id) throws Exception {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.PRODUCTO_UPDATE);
		Product product = productoService.findByIdProduct(id).get();
		mAV.addObject("producto", product);
		return mAV;
	}

	@PostMapping("/update")
	public RedirectView update(@ModelAttribute("producto") Product product) throws Exception {
		Optional<Product> productoToUpdate = productoService.findByIdProduct(product.getIdProduct());
		if (productoToUpdate.isPresent()) {
			productoToUpdate.get().setName(product.getName());
			productoToUpdate.get().setSellingPrice(product.getSellingPrice());
			productoService.insertOrUpdate(productoToUpdate.get());
		}
		return new RedirectView(ViewRouteHelper.PRODUCTO_ROOT);
	}

	@PostMapping("/delete/{id}")
	public RedirectView delete(@PathVariable("id") int id) {
		productoService.remove(id);
		return new RedirectView(ViewRouteHelper.PRODUCTO_ROOT);
	}

	@GetMapping("/")
	public RedirectView redirectToHomeIndex() {
		return new RedirectView(ViewRouteHelper.PRODUCTO_ROOT);
	}

	@GetMapping("/consulta-por-producto")
	public ModelAndView consultaPorProductoForm() {
		ModelAndView mAV = new ModelAndView(ViewRouteHelper.INFORME);
		mAV.addObject("productos", productoService.getAll());
		return mAV;
	}
}
