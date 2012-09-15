package com.watsoncui.nkcms.designpattern.decorator;

public class DarkRoast extends Beverage{
	public DarkRoast() {
		description = new StringBuffer("DarkRoast");
	}
	
	public double cost() {
		return .99;
	}
}
