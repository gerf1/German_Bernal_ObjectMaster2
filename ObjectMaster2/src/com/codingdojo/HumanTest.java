package com.codingdojo;

public class HumanTest {

	public static void main(String[] args) {
		Ninja ninja = new Ninja();
		Wizard wizard = new Wizard();
		Samurai samurai = new Samurai();

		ninja.runAway();
		ninja.displayHealth();

		ninja.steal(wizard);
		ninja.displayHealth();

		samurai.meditate();
		samurai.howMany();
		samurai.deathBlow(samurai);

		wizard.heal(wizard);
		wizard.displayHealth();

		wizard.fireBall(samurai);
		samurai.displayHealth();

		ninja.steal(samurai);
		ninja.displayHealth();
	}

}
