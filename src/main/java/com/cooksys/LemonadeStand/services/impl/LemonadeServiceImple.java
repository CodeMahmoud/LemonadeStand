package com.cooksys.LemonadeStand.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cooksys.LemonadeStand.entities.Lemonade;
import com.cooksys.LemonadeStand.repositories.LemonadeRepository;
import com.cooksys.LemonadeStand.services.LemonadeService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class LemonadeServiceImple implements LemonadeService{
	
	private LemonadeRepository lemonadeRepository; 
	
	@Override
	public List<Lemonade> getAllLemonades() {
		
		return lemonadeRepository.findAll();
	}

	@Override
	public Lemonade createLemonade(Lemonade lemonade) {
		
		lemonade.setPrice(lemonade.getLemonJuice() * .20 + lemonade.getWater() * .1 + lemonade.getSugar() * .15 + lemonade.getIceCubes() * .05 + .50);
		return lemonadeRepository.saveAndFlush(lemonade);
	}
	
}
