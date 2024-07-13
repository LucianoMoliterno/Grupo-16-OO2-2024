package com.unla.stocksystem.helpers;

//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import com.unla.stocksystem.entity.User;
import com.unla.stocksystem.entity.UserRole;
import com.unla.stocksystem.service.UserService;
@Component
public class UserUtil {
	public final static String ROLE_ADMIN = "ROLE_ADMIN";
	public final static String ROLE_USER = "ROLE_USER";

	private static UserService userService = null;

	@SuppressWarnings("static-access")
	public UserUtil(UserService userService) {
		this.userService = userService;
	}

	public static User getUser() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		if (authentication == null || !authentication.isAuthenticated()) {
			System.out.println("Authentication is null or not authenticated");
			return null;
		}

		Object principal = authentication.getPrincipal();
		String username;

		if (principal instanceof UserDetails) {
			username = ((UserDetails) principal).getUsername();
		} else {
			username = principal.toString();
		}

		try {
			User user = (User) userService.loadUserByUsername(username);
			if (user == null) {
				System.out.println("User not found with username: " + username);
			}
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static boolean isAdmin() {
		User user = getUser();

		if (user == null) {
			System.out.println("User is null in isAdmin check");
			return false;
		}

		boolean isAdmin = false;

		for (UserRole rol : user.getUserRoles()) {
			if (rol.toString().equalsIgnoreCase("ROLE_ADMIN")) {
				isAdmin = true;
			}
		}

		return isAdmin;
	}

	public static boolean isRol(String rol) {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getAuthorities().stream().anyMatch(r -> r.getAuthority().equals(rol));
	}
}
