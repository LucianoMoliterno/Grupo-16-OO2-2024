package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="product_id")
	private Product product;
	
	public Stock() {
		super();
	}

	public Stock(int quantity, int quantyMin, Product product) {
		super();
		this.quantity = quantity;
		this.quantyMin = quantyMin;
		this.product = product;
	}

	
}
