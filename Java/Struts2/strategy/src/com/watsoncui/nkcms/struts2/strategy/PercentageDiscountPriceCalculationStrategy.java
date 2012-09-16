package com.watsoncui.nkcms.struts2.strategy;

import java.math.BigDecimal;

public class PercentageDiscountPriceCalculationStrategy implements PriceCalculationStrategy {

	double price;
	double copies;
	double rate;
	BigDecimal result;
	
	public PercentageDiscountPriceCalculationStrategy(double price, double copies, double rate) {
		this.copies = copies;
		this.price = price;
		this.rate = rate;
		this.result = new BigDecimal(copies * price * rate);
	}
	
	@Override
	public BigDecimal calculatePrice() {
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public boolean match(double price) {
		// TODO Auto-generated method stub
		if ((rate > 0.499)&&(rate <= 0.601)) {
			if(result.doubleValue() >= 10000) {
				return true;
			}
		}
		if ((rate > 0.601)&&(rate <= 0.751)) {
			if(result.doubleValue() >= 5000) {
				return true;
			}
		}
		if ((rate > 0.751)&&(rate <= 0.851)) {
			if(result.doubleValue() >= 1000) {
				return true;
			}
		}
		if ((rate > 0.851)&&(rate <= 0.991)) {
			if(result.doubleValue() >= 300) {
				return true;
			}
		}
		return false;
	}

}
