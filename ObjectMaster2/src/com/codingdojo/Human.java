package com.codingdojo;

public class Human {

	int strength=0;
	int stealth=0;
	int intelligence=0;
	int health=0;

	public void attack(Human h) {
		health -= strength;

	}

	public void displayHealth() {

		System.out.println("Your health is, " + health);
	}
}
