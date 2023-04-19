package com.cooksys.LemonadeStand.repositories;

import com.cooksys.LemonadeStand.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
