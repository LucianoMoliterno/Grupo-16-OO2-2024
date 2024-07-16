package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
<<<<<<< HEAD
import jakarta.persistence.FetchType;
=======
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
<<<<<<< HEAD
import jakarta.persistence.OneToOne;
=======
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
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
<<<<<<< HEAD

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "quantityMin")
	private int quantyMin;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id")
	private Product product;

	public Stock(int quantity, int quantyMin, Product product) {
		super();
		this.quantity = quantity;
		this.quantyMin = quantyMin;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
=======
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
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
