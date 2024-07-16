package com.unla.stocksystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.unla.stocksystem"})

public class StockSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockSystemApplication.class, args);
		
	}

}
