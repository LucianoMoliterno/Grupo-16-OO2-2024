package com.unla.stocksystem.service;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.entity.Stock;
import com.unla.stocksystem.repositories.IProductRepository;
import com.unla.stocksystem.repositories.IStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;
    @Autowired
    private IStockRepository stockRepository;

    public Product addProductToStock(Product product) {
        Stock stock = new Stock(0, 10, product); // Asignamos una cantidad mínima por defecto
        product.setStock(stock);
        return productRepository.save(product);
    }

    public List<Product> searchProducts(String keyword) {
        return productRepository.findByNameContaining(keyword);
    }
}
