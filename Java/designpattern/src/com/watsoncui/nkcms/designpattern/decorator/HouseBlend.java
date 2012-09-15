package com.watsoncui.nkcms.designpattern.decorator;

public class HouseBlend extends Beverage{
	public HouseBlend() {
		description = new StringBuffer("House Blend Coffee");
	}
	
	public double cost() {
		return .89;
	}
}
