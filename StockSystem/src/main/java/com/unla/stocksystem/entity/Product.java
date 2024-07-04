package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduct;
	@Column(name = "name")
	private String name;
	@Column(name = "sellingPrice")
	private double sellingPrice;

	public Product(int idProduct, String name, double sellingPrice) {
		super();
		this.idProduct = idProduct;
		this.name = name;
		this.sellingPrice = sellingPrice;
	}

}