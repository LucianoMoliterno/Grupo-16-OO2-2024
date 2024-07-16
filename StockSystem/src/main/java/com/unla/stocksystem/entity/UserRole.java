package com.unla.stocksystem.entity;
<<<<<<< HEAD
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
=======

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
import lombok.Setter;

@Entity
@Getter
@Setter
<<<<<<< HEAD
@NoArgsConstructor
@Table(name = "user_role", uniqueConstraints = @UniqueConstraint(columnNames = { "nameRole", "user_id" }))
public class UserRole {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUserRole;

	@Column(name = "nameRole", nullable = false, length = 45)
	private String nameRole;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	// Constructor con argumentos
	
	
	public UserRole(int idUserRole, String nameRole, User user) {
		super();
		this.idUserRole = idUserRole;
		this.nameRole = nameRole;
		this.user = user;
	}

	public UserRole() {
		super();
	}

	public String getNameRole() {
		return nameRole;
	}

	public void setNameRole(String nameRole) {
		this.nameRole = nameRole;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
=======
@Table(name = "UserRole", uniqueConstraints = @UniqueConstraint(columnNames = { "nameRole" }))
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserRole;

    @Column(name = "nameRole", nullable = false, length = 45)
    private String nameRole;

    // Constructor sin argumentos explícito
    public UserRole() {
    }

    // Constructor con argumentos
    public UserRole(String nameRole) {
        this.nameRole = nameRole;
    }

    // Getter explícito (aunque Lombok debería generarlo)
    public String getNameRole() {
        return nameRole;
    }
}
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
