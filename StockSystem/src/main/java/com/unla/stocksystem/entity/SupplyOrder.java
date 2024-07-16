package com.unla.stocksystem.entity;

import java.time.LocalDate;

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
<<<<<<< HEAD
=======

>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "supply_order")
public class SupplyOrder {
	@Id
<<<<<<< HEAD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
	private int idSupplyOrder;
	@Column(name = "requestedAmount")
	private int requestedAmount;
	@Column(name = "date")
	private LocalDate date;
	@ManyToOne(optional = false)
	@JoinColumn(name = "product")
	private Product product;
<<<<<<< HEAD
=======

>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
	public SupplyOrder(int idSupplyOrder, int requestedAmount, LocalDate date, Product product) {
		super();
		this.idSupplyOrder = idSupplyOrder;
		this.requestedAmount = requestedAmount;
		this.date = date;
		this.product = product;
	}
<<<<<<< HEAD
	
}
=======

}
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
