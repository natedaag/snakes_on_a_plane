package com.cooksys.pets;

import com.cooksys.snakes.Snake;

public class Plane {

	private Snake[] snakes;
	
	private InnocentVictim victim;

	private SamuelLJackson samjack;
	
	public Plane(InnocentVictim victim, SamuelLJackson samjack, Snake... snakes) {
		this.snakes = snakes;
		this.victim = victim;
		this.samjack = samjack;
	}
	
	public void terribleSnakeAccident() {
		for(Snake s : snakes) {
			s.bite(victim);
			s.bite(samjack);
		}
	}
	
}
