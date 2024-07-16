package com.unla.stocksystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.unla.stocksystem.entity.Product;
import com.unla.stocksystem.entity.Stock;
import com.unla.stocksystem.repositories.IStockRepository;

@Service("stockService")
public class StockService implements IStockService {
	private final IStockRepository stockRepository;

	public StockService(IStockRepository stockRepository) {
		this.stockRepository = stockRepository;
	}

	@Override
	public List<Stock> getAll() {
		// TODO Auto-generated method stub
		return stockRepository.findAll();

	}

	@Override
	public Optional<Stock> findByIdStock(int idStock) throws Exception {
		try {
            return stockRepository.findById(idStock);
        } catch (Exception e) {
            throw new Exception("Error de fetching stock con id: " + idStock, e);
        }
	}

	@Override
	public Stock insertOrUpdate(Stock stock) {
		// TODO Auto-generated method stub
		return stockRepository.save(stock);
	}

	@Override
	public Stock findByProduct(Product product) {
		// TODO Auto-generated method stub
		return stockRepository.findByProduct(product);
	}

	@Override
	public List<Stock> traerConProductos() {
		// TODO Auto-generated method stub
		return stockRepository.traerConProductos();
	}
}
