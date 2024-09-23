package com.jonatanpaiva.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jonatanpaiva.webservices.entities.OrderItem;
import com.jonatanpaiva.webservices.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
