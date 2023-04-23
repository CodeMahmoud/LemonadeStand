package com.cooksys.LemonadeStand.services;

import java.util.List;

import com.cooksys.LemonadeStand.entities.Lemonade;

public interface LemonadeService {

	List<Lemonade> getAllLemonades();

	Lemonade createLemonade(Lemonade lemonade);

}
 