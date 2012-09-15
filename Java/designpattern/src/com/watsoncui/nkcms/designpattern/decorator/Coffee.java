package com.watsoncui.nkcms.designpattern.decorator;

public class Coffee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription().append(" $").append(beverage.cost()));
		
		Beverage coffee1 = new DarkRoast();
		Beverage coffee2 = new HouseBlend();
		
		coffee1 = new Mocha(coffee1, 2);
		coffee1 = new Whip(coffee1);
		
		System.out.println(coffee1.getDescription().append(" $").append(coffee1.cost()));
		
		coffee2 = new Soy(coffee2);
		coffee2 = new Mocha(coffee2);
		coffee2 = new Whip(coffee2);
		
		System.out.println(coffee2.getDescription().append(" $").append(coffee2.cost()));
	}

}
