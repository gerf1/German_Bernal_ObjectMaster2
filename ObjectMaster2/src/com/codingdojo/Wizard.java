package com.codingdojo;

public class Wizard extends Human {

	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}

	public void heal(Human h) {
		h.health += this.intelligence;
		System.out.println("Healing ");

	}

	public void fireBall(Human h) {
		h.health -= this.intelligence * 3;
		System.out.println("Fire Ball ");

	}
}
