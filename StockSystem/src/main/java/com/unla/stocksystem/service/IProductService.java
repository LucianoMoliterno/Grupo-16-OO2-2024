package com.unla.stocksystem.service;

import java.util.List;
import java.util.Optional;

import com.unla.stocksystem.entity.Product;

public interface IProductService {
	public List<Product> getAll();

	// public Optional<Product> findById(int idProduct) throws Exception;
	public Optional<Product> findByName(String name) throws Exception;

	public Product insertOrUpdate(Product product);

	public boolean remove(int idProduct);

	public Optional<Product> findByIdProduct(int idProduct) throws Exception;
}
