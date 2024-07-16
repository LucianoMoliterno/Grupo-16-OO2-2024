package com.unla.stocksystem.service;

import com.unla.stocksystem.entity.Stock;
import com.unla.stocksystem.repositories.IStockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {
	@Autowired
	private IStockRepository stockRepository;

	public List<Stock> getAllStock() {
		return stockRepository.findAll();
	}

	public Stock addStock(int productId, int quantity) {
		Stock stock = stockRepository.findByProduct_IdProduct(productId);
		if (stock != null) {
			stock.setQuantity(stock.getQuantity() + quantity);
			return stockRepository.save(stock);
		}
		throw new RuntimeException("Product not found");
	}

	public Stock getStockByProductId(int productId) {
		return stockRepository.findByProduct_IdProduct(productId);
	}

	public List<Stock> generateStockReport() {
		return stockRepository.findAll();
	}

	public void checkLowStock() {
		List<Stock> lowStockItems = stockRepository.findByQuantityLessThan(10); // Umbral de stock bajo
		if (!lowStockItems.isEmpty()) {
			// Enviar alertas (puede ser un correo, notificación, etc.)
		}
	}
}
