package com.newageautomation;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class UserBuilder {

	public User createUser(int userId, String password, boolean isEmployee,
			boolean isAffiliate, boolean isCustomer, Date startDate) {
		Set<UserType> userTypes = new HashSet<UserType>();
		if (isEmployee) {
			userTypes.add(new Employee());
		} 
		if (isAffiliate) {
			userTypes.add(new Affiliate());
		}
		if (isCustomer) {
			userTypes.add(new Customer(startDate));
		}
		if(userTypes.size() < 1) {
			//log.debug("Incorrect User Params provided");
			return null;
		}
		return new User(userId, password, userTypes);
	}
	
}






