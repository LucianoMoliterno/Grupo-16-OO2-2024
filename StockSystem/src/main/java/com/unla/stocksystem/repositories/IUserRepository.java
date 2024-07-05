package com.unla.stocksystem.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.unla.stocksystem.entity.User;

import java.io.Serializable;
import java.util.Optional;

@Repository
public interface IUserRepository extends JpaRepository<User,Serializable> {
    //Optional<User> findByUsername(String username);

    @Query("SELECT u FROM User u JOIN FETCH u.userRole WHERE u.userName = :userName")
    public abstract Optional<User> findByUsernameAndFetchUserRoleEagerly(@Param("userName") String username);
}