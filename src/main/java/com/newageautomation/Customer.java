package com.newageautomation;

import java.util.Date;

public class Customer extends UserType {
	
	private Date startDate;
	//Customer specific values should be encapsulated here
	
	public Customer(Date startDate) {
		setStartDate(startDate);
		this.discountPercentage = 0.05; //This discount will only apply if difference
		// between Today and startDate is greater than 2 years
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
}





