package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Purchase {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPurchase;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "total")
	private double total;
	@ManyToOne(optional = false)
	@JoinColumn(name = "product")
	private Product product;
	@ManyToOne(optional = false)
	@JoinColumn(name = "client")
	private User client;

	
	public Purchase(int idPurchase, int quantity, Product product, User client, double total) {
		super();
		this.idPurchase = idPurchase;
		this.quantity = quantity;
		this.product = product;
		this.client = client;
		this.total = total;
	}
	
	
}
