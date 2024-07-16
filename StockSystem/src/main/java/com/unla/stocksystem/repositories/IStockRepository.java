package com.unla.stocksystem.repositories;

import com.unla.stocksystem.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStockRepository extends JpaRepository<Stock, Integer> {
    Stock findByProduct_IdProduct(int productId);
    List<Stock> findByQuantityLessThan(int quantity);
}
