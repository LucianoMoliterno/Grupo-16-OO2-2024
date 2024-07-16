package com.unla.stocksystem.entity;

<<<<<<< HEAD
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
=======
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
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
<<<<<<< HEAD
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "sellingPrice")
	private double sellingPrice;
	
	@OneToOne(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Stock stock;

	public Product(String name, double sellingPrice, Stock stock) {
		super();
		this.name = name;
		this.sellingPrice = sellingPrice;
		this.stock = stock;
	}

	 public void setStock(Stock stock) {
	        this.stock = stock;
	    }
}
=======
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
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
