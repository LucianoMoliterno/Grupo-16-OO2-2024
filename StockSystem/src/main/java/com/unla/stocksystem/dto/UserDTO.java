package com.unla.stocksystem.dto;

import com.unla.stocksystem.entity.UserRole;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
public class UserDTO {
	private int idUser;
    private String userName;
    private String password;
    private UserRole userRole;
	public UserDTO(String userName, String password, UserRole userRole) {
		super();
		this.userName = userName;
		this.password = password;
		this.userRole = userRole;
	}
    
}
