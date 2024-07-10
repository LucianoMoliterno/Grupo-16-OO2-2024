package com.unla.stocksystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.repositories.IProductRepository;

@Service
public class ProductService {

    @Autowired
    private IProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addProduct(Product producto) {
        return productRepository.save(producto);
    }

    // Agregar otros métodos según sea necesario
}
