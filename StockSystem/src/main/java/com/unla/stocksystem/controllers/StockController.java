package com.unla.stocksystem.controllers;

import com.unla.stocksystem.entity.Stock;
import com.unla.stocksystem.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    @GetMapping
    public List<Stock> getAllStock() {
        return stockService.getAllStock();
    }

    @PostMapping("/add")
    public Stock addStock(@RequestParam int productId, @RequestParam int quantity) {
        return stockService.addStock(productId, quantity);
    }

    @GetMapping("/{productId}")
    public Stock getStockByProductId(@PathVariable int productId) {
        return stockService.getStockByProductId(productId);
    }

    @GetMapping("/report")
    public List<Stock> generateStockReport() {
        return stockService.generateStockReport();
    }
}
