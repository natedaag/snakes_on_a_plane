package com.cooksys.pets;

public class InnocentVictim implements Victim, HasEyes {

	public void receiveBite(boolean lethal) {
		System.out.println("Ouch! I am " + (lethal ? "dead x.x" : "badly wounded"));
		
	}

}
