package com.codingdojo;

public class Samurai extends Human {

	public int counter = 0;

	public Samurai() {
		this.health = 200;
		counter++;

	}

	public void deathBlow(Human h) {
		h.health = 0;
		this.health = (this.health / 2);
	}

	public void meditate() {
		counter++;

		this.health += (this.health / 2);
		System.out.println("Samurai is meditating ");
	}

	public void howMany() {
		System.out.println("Samurais : " + counter);
	}

}
