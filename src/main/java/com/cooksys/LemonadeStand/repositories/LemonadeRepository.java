package com.cooksys.LemonadeStand.repositories;

import com.cooksys.LemonadeStand.entities.Lemonade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LemonadeRepository extends JpaRepository<Lemonade, Long> {

}
