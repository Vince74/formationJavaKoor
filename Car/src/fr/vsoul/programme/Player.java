package fr.vsoul.programme;

public class Player {
	
	private String name;
	private double health;
	private double attack;

	public Player(String name, double health, double attack) {
		this.setName(name);
		this.setHealth(health);
		this.setAttack(attack);
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getAttack() {
		return attack;
	}


	public void setAttack(double attack) {
		this.attack = attack;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}
	
	public double dammage( double damage) {
		this.health -= damage;
		return this.health;
	}

	
}
