package com.watsoncui.nkcms.designpattern.decorator;

public class Whip extends CondimentDecorator {

	Beverage beverage;
	int multiple;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.multiple = 1;
	}
	
	public Whip(Beverage beverage, int multiple) {
		this.beverage = beverage;
		this.multiple = multiple;
	}
	
	@Override
	public StringBuffer getDescription() {
		if(this.multiple == 1) {
			return beverage.getDescription().append(", Whip");
		} else {
			return beverage.getDescription().append(", Whip ").append(multiple);
		}
	}

	@Override
	public double cost() {
		return this.multiple * .10 + beverage.cost();
	}

}
