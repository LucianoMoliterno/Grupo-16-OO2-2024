package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Getter
@Setter
@Table(name = "Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idUser;

	@NotBlank
	@Size(min = 3, max = 50)
	@Column(name = "userName")
	private String userName;

	@Column(name = "password", length = 60)
	private String password;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUserRole", nullable = false)
	private UserRole userRole;

	// Constructor por defecto
	public User() {
	}

	// Constructor con parámetros
	public User(int idUser, String userName, String password, UserRole userRole) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.password = password;
		this.userRole = userRole;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}
