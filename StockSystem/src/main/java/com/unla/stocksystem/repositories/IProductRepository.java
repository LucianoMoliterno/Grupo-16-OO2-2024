package com.unla.stocksystem.repositories;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.unla.stocksystem.entity.Product;

@Repository("productRepository")
public interface IProductRepository extends JpaRepository<Product, Serializable> {
	public abstract Optional<Product> findByName(String name);

	public abstract Optional<Product> findByIdProduct(int idProduct);

}
