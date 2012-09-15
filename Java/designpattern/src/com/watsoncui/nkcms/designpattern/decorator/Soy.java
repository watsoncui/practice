package com.watsoncui.nkcms.designpattern.decorator;

public class Soy extends CondimentDecorator {

	Beverage beverage;
	int multiple;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.multiple = 1;
	}
	
	public Soy(Beverage beverage, int multiple) {
		this.beverage = beverage;
		this.multiple = multiple;
	}
	
	@Override
	public StringBuffer getDescription() {
		if(this.multiple == 1) {
			return beverage.getDescription().append(", Soy");
		} else {
			return beverage.getDescription().append(", Soy ").append(multiple);
		}
	}

	@Override
	public double cost() {
		
		return this.multiple * .15 + beverage.cost();
	}

}
