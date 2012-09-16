package com.watsoncui.nkcms.struts2.strategy;

import java.math.BigDecimal;

public class NoDiscountPriceCalculationStrategy implements PriceCalculationStrategy{

	private double price;
	
	private double copies;
	
	private BigDecimal result;
	
	public NoDiscountPriceCalculationStrategy(double price, double copies) {
		this.price = price;
		this.copies = copies;
		this.result = new BigDecimal(price * copies);
	}
	
	@Override
	public BigDecimal calculatePrice() {
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public boolean match(double price) {
		// TODO Auto-generated method stub
		if(result.doubleValue() < 300.0) {
			return true;
		}
		return false;
	}

}
