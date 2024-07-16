package com.unla.stocksystem.repositories;

<<<<<<< HEAD
import com.unla.stocksystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByNameContaining(String keyword);
}
=======
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.unla.stocksystem.entity.Product;

@Repository
public interface IProductRepository extends JpaRepository<Product, Integer> {
    // Puedes agregar métodos personalizados aquí si los necesitas
}
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
