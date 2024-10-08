package com.jonatanpaiva.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatanpaiva.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
