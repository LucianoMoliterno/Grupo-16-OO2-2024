package com.unla.stocksystem.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.User;

import com.unla.stocksystem.entity.UserRole;
import com.unla.stocksystem.repositories.IUserRepository;

@Service("userService")
public class UserService implements UserDetailsService {

	private IUserRepository userRepository;

	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public List<com.unla.stocksystem.entity.User> findUsers() {
		List<com.unla.stocksystem.entity.User> users = new ArrayList<com.unla.stocksystem.entity.User>();
		users = (List<com.unla.stocksystem.entity.User>) userRepository.findUsers();
		return users;
	}

	public List<com.unla.stocksystem.entity.User> findAdmins() {
		List<com.unla.stocksystem.entity.User> admins = new ArrayList<com.unla.stocksystem.entity.User>();
		admins = (List<com.unla.stocksystem.entity.User>) userRepository.findAdmins();
		return admins;
	}

	public com.unla.stocksystem.entity.User findUserByUsername(String username) {
		com.unla.stocksystem.entity.User user = userRepository.findByUsernameAndFetchUserRolesEagerly(username);
		return user;
	}

	 private User buildUser(com.unla.stocksystem.entity.User user,
	 List<GrantedAuthority> grantedAuthorities) {
	 return new User(user.getUserName(), user.getPassword(), user.isEnabled(),
	 true, true, true, grantedAuthorities);
	 }
	

	// @Override
	// public UserDetails loadUserByUsername(String username) throws
	// UsernameNotFoundException {
	// com.unla.stocksystem.entity.User user =
	// userRepository.findByUsernameAndFetchUserRolesEagerly(username);
	// return buildUser(user, buildGrantedAuthorities(user.getUserRoles()));
	// }
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		com.unla.stocksystem.entity.User user = userRepository.findByUsernameAndFetchUserRolesEagerly(username);
		if (user == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return buildUser(user, buildGrantedAuthorities(user.getUserRoles()));
	}

	private List<GrantedAuthority> buildGrantedAuthorities(Set<UserRole> userRoles) {
		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		for (UserRole userRole : userRoles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(userRole.getNameRole()));
		}
		return new ArrayList<>(grantedAuthorities);
	}
}
