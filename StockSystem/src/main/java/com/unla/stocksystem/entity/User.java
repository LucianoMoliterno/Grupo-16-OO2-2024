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
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "User")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUser;
    @Column(name = "userName")
    private String userName;
    @Column(name = "password", length = 12)
    private String password;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idUserRole", nullable = false)
    private UserRole userRole;

    public User(int idUser, String userName, String password, UserRole userRole) {
        super();
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.userRole = userRole;
    }

}