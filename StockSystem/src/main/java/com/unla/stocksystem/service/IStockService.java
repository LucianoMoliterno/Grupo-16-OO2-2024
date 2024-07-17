package com.unla.stocksystem.service;

import java.util.List;
import java.util.Optional;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.entity.Stock;

public interface IStockService {
	public List<Stock> getAll();

	public Optional<Stock> findByIdStock(int idStoc) throws Exception;

	public Stock insertOrUpdate(Stock stock);

	public abstract Stock findByProduct(Product product);

	public abstract List<Stock> traerConProductos();
}