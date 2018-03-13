package com.cooksys.pets;

public interface HasEyes {

	default void getVendomInEyes() {
		System.out.println("Ahh! My eyes!");
	}

}
