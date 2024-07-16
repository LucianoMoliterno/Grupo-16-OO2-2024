package com.unla.stocksystem.repositories;

<<<<<<< HEAD
=======

>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.stocksystem.entity.User;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.List;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User, Serializable> {

	@Query("SELECT u FROM User u JOIN FETCH u.userRoles WHERE u.userName = :userName")
	public abstract User findByUsernameAndFetchUserRolesEagerly(@Param("userName") String username);

	@Query("SELECT u FROM User u JOIN FETCH u.userRoles ur WHERE ur.nameRole = ('ROLE_USER')")
	public abstract List<User> findUsers();

	@Query("SELECT u FROM User u JOIN FETCH u.userRoles ur WHERE ur.nameRole = ('ROLE_ADMIN')")
	public abstract List<User> findAdmins();

	public abstract User findByUserName(String userName);
}
=======
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Serializable> {
    //Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u JOIN FETCH u.userRole WHERE u.userName = :userName")
    public abstract Optional<User> findByUsernameAndFetchUserRoleEagerly(@Param("userName") String username);
}
>>>>>>> fd355c9b62cbde8580b1340673407ca8372e3adb
