package com.newageautomation;

import java.util.Date;

public class UserTypeFactory {

	public UserType userTypeFactory(String userTypeString, Date startDate) {
		if(userTypeString.equals(UserType.CUSTOMER)) {
			return new Customer(startDate);
		} else if (userTypeString.equals(UserType.EMPLOYEE)) {
			return new Employee();
		} else if (userTypeString.equals(UserType.AFFILIATE)) {
			return new Affiliate();
		} else {
			//log.debug("Incorrect userTypeString");
			return null;
		}
			
	}
	
}


