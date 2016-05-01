package com.newageautomation;

import java.util.Date;

public abstract class UserType {
	
	public static String EMPLOYEE = "Employee";
	public static String AFFILIATE = "Affiliate";
	public static String CUSTOMER = "Customer";

	protected double discountPercentage = 0;
	
	public String getType() {
		if(this instanceof Employee) {
			return EMPLOYEE;
		} else if (this instanceof Affiliate) {
			return AFFILIATE;
		} else if (this instanceof Customer) {
			return CUSTOMER;
		} else {
			//TO-DO: Configure log4j
			//log.debug("Incorrectly defined UserType"); 
			return "INVALID";
		}
	}
	
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	
	public void setDiscountPercentage(double disountPercentage) {
		this.discountPercentage = discountPercentage;
	}
}







