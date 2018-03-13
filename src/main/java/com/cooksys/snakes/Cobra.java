package com.cooksys.snakes;

import com.cooksys.pets.HasEyes;
import com.cooksys.pets.Victim;

public class Cobra extends Snake {

	public Cobra(int teeth, double length) {
		super(teeth, length, true);
	}
	
	@Override
	public void bite(Victim victim) {
		victim.receiveBite(true);
	}
	
	public void venomSpit(HasEyes eyedIndividual) {
		eyedIndividual.getVendomInEyes();

	}

}
