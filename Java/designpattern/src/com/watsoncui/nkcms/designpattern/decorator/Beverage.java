package com.watsoncui.nkcms.designpattern.decorator;

public abstract class Beverage {
	StringBuffer description = new StringBuffer("Unknown Beverage");
	
	public StringBuffer getDescription() {
		return description;
	}
	
	public abstract double cost();
}
