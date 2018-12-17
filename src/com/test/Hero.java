package com.test;

public class Hero {

	public String name;
	public float hp;
	
	public int damage;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHp() {
		return hp;
	}

	public void setHp(float hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public Hero() {}
	public Hero(String name) {
		this.name = name;
	}
	public boolean matched() {
		return this.hp>100 && this.damage<50;
	}
	public Hero(String name, float hp, int damage) {
		this.name = name;
		this.damage = damage;
		this.hp = hp;
		
	}
	public int compareHero(Hero h) {
		return hp>=h.hp?-1:1;
		
	}
	public String toString() {
		return "Hero [name]"+name +", hp"+ hp +",damage+"+ damage+"]\r\n";
	}

}
