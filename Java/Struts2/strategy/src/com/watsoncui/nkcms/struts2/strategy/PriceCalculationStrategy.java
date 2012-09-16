package com.watsoncui.nkcms.struts2.strategy;

import java.math.BigDecimal;

public interface PriceCalculationStrategy {
	
	public BigDecimal calculatePrice();
	
	public boolean match(double price);
}
