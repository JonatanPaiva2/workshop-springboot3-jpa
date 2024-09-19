package com.jonatanpaiva.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatanpaiva.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
