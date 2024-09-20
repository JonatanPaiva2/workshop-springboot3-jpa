package com.jonatanpaiva.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatanpaiva.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
