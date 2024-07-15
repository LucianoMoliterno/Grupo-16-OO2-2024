package com.unla.stocksystem.repositories;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.entity.Stock;



//stocks que si se pueden manipular
@Repository("stockRepository")
public interface IStockRepository extends JpaRepository<Stock, Serializable>{
	public abstract Optional<Stock> findById(int id);
	public abstract Stock findByProduct(Product product);//trae por producto
	public abstract List<Stock> findAll();
	
	@Query("SELECT s FROM Stock s WHERE s.quantity > 0")//trae stock pero con productos
	public abstract List<Stock> traerConProductos();
}
