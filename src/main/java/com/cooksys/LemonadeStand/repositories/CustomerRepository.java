package com.cooksys.LemonadeStand.repositories;

import com.cooksys.LemonadeStand.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
