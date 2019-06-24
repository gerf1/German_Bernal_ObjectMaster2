package com.codingdojo;

public class Ninja extends Human {

	public Ninja() {
		this.health = 100;
		this.stealth = 10;
	}

	public void steal(Human h) {
		h.health -= stealth;
		this.health += stealth;

		System.out.println("Ninja Steal Human " + stealth);

	}

	public void runAway() {
		health -= 10;
		System.out.println("Ninja run away... ");

	}

}
