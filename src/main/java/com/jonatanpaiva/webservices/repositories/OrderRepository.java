package com.jonatanpaiva.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatanpaiva.webservices.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
