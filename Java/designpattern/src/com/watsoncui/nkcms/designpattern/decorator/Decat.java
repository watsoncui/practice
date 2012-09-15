package com.watsoncui.nkcms.designpattern.decorator;

public class Decat extends Beverage {

	public Decat() {
		description = new StringBuffer("Decat");
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}
}
