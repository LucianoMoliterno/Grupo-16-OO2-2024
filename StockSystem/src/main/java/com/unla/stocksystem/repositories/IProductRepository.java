package com.unla.stocksystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.stocksystem.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    // Puedes agregar métodos personalizados aquí si los necesitas
}