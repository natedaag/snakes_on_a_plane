package com.cooksys.launch;

import com.cooksys.pets.InnocentVictim;
import com.cooksys.pets.Plane;
import com.cooksys.pets.SamuelLJackson;
import com.cooksys.snakes.Cobra;
import com.cooksys.snakes.Snake;

public class Launcher {

	public static void main(String[] args) {
		
		Snake snake = new Snake(6, 100, false);
		Snake snakeTwo = new Snake(6, 100, false);
		
		Cobra cobra = new Cobra(88, 5);
		
		InnocentVictim employee = new InnocentVictim();
		
		SamuelLJackson samjack = new SamuelLJackson();
	
		Plane plane = new Plane(employee, samjack, snake, cobra);
		plane.terribleSnakeAccident();
		
		cobra.venomSpit(employee);
		cobra.venomSpit(samjack);
		
		Object whateva = new InnocentVictim();
		
		System.out.println(snake);
		
	}
	
}
