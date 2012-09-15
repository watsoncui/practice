package com.watsoncui.nkcms.designpattern.decorator;

public class Espresso extends Beverage{
	public Espresso() {
		description = new StringBuffer("Espresso");
	}
	
	public double cost() {
		return 1.99;
	}
}
