package com.watsoncui.nkcms.designpattern.decorator;

public class Milk extends CondimentDecorator {

	Beverage beverage;
	int multiple;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
		this.multiple = 1;
	}
	
	public Milk(Beverage beverage, int multiple) {
		this.beverage = beverage;
		this.multiple = multiple;
	}
	
	@Override
	public StringBuffer getDescription() {
		if(this.multiple == 1) {
			return beverage.getDescription().append(", Milk");
		} else {
			return beverage.getDescription().append(", Milk ").append(multiple);
		}
	}

	@Override
	public double cost() {
		return this.multiple * .10 + beverage.cost();
	}

}
