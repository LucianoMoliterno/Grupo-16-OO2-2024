package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idStock;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "quantityMin")
	private int quantyMin;
	@ManyToOne(optional = false)
	@JoinColumn(name = "product")
	private Product product;

	public Stock(int idStock, int quantity, Product product, int quantyMin) {
		super();
		this.idStock = idStock;
		this.quantity = quantity;
		this.product = product;
		this.quantyMin = quantyMin;
	}

}