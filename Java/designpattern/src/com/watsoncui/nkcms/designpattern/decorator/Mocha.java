package com.watsoncui.nkcms.designpattern.decorator;

public class Mocha extends CondimentDecorator {
	Beverage beverage;
	int multiple;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.multiple = 1;
	}
	
	public Mocha(Beverage beverage, int multiple) {
		this.beverage = beverage;
		this.multiple = multiple;
	}
	
	@Override
	public StringBuffer getDescription() {
		if(this.multiple == 1) {
			return beverage.getDescription().append(", Mocha");
		} else {
			return beverage.getDescription().append(", Mocha ").append(multiple);
		}	
	}
	
	public double cost() {
		return this.multiple * .20 + beverage.cost();
	}
}
