package com.unla.stocksystem.entity;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;
=======
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
<<<<<<< HEAD
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
=======
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb

@Entity
@Getter
@Setter
<<<<<<< HEAD
@NoArgsConstructor
@Table(name = "user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	@Column(name = "userName")
	private String userName;
	@Column(name = "password", length = 60)
	private String password;
    @Column(name = "enabled")
	private boolean enabled;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	private Set<UserRole> userRoles = new HashSet<>();
	
	public User() {
		super();
	}

	public User(String userName, String password, boolean enabled) {
		super();
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
	}

	public User(String userName, String password, boolean enabled, Set<UserRole> userRoles) {
		super();
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.userRoles = userRoles;
=======
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
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
	}

	public String getUserName() {
		return userName;
	}

<<<<<<< HEAD
	public void setUserName(String userName) {
		this.userName = userName;
	}

=======
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
	public String getPassword() {
		return password;
	}

<<<<<<< HEAD
=======
	public UserRole getUserRole() {
		return userRole;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
	public void setPassword(String password) {
		this.password = password;
	}

<<<<<<< HEAD
	public Set<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<UserRole> userRoles) {
		this.userRoles = userRoles;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
=======
	public void setUserRole(UserRole userRole) {
		this.userRole = userRole;
	}

}
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
