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

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "supply_order")
public class SupplyOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSupplyOrder;
	@Column(name = "requestedAmount")
	private int requestedAmount;
	@Column(name = "date")
	private LocalDate date;
	@ManyToOne(optional = false)
	@JoinColumn(name = "product")
	private Product product;

	public SupplyOrder(int idSupplyOrder, int requestedAmount, LocalDate date, Product product) {
		super();
		this.idSupplyOrder = idSupplyOrder;
		this.requestedAmount = requestedAmount;
		this.date = date;
		this.product = product;
	}

}