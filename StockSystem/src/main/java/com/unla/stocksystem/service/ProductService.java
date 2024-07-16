package com.unla.stocksystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.repositories.IProductRepository;
//import com.unla.stocksystem.service.IProductService;

@Service("productService")
public class ProductService implements IProductService {
	private IProductRepository productRepository;

	public ProductService(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findByName(String nombre) throws Exception {
		return productRepository.findByName(nombre);
	}

	@Override
	public Optional<Product> findByIdProduct(int idProduct) throws Exception {
		return productRepository.findById(idProduct);
	}

	@Override
	public Product insertOrUpdate(Product product) {
		return productRepository.save(product);
	}

	@Override
	public boolean remove(int id) {
		try {
			productRepository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
