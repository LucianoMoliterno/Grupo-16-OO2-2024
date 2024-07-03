package com.unla.stocksystem.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "UserRole", uniqueConstraints = @UniqueConstraint(columnNames = { "nameRole" }))
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUserRole;

    @Column(name = "nameRole", nullable = false, length = 45)
    private String nameRole;

    // Constructor con argumentos
    public UserRole(String nameRole) {
        this.nameRole = nameRole;
    }

    // Getters y setters generados por Lombok

}
