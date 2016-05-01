package com.newageautomation;

import java.util.Calendar;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BillProcessor {

	public static double processBill(Bill bill, User user) {
		double percentageDiscount = 0;
		Calendar today = Calendar.getInstance();
		Set<UserType> userTypes = user.getListOfUserTypes();
		for(UserType userType : userTypes) {
			if(userType.getType().equals(UserType.EMPLOYEE)) {
				if (percentageDiscount < userType.getDiscountPercentage()) {
					percentageDiscount = userType.getDiscountPercentage();
				}
			} else if (userType.getType().equals(UserType.AFFILIATE)) {
				if (percentageDiscount < userType.getDiscountPercentage()) {
					percentageDiscount = userType.getDiscountPercentage();
				}
			} else if (userType.getType().equals(UserType.CUSTOMER)) {
				Calendar startDate = Calendar.getInstance();
				startDate.setTime(((Customer)userType).getStartDate());
				if ((daysBetween(startDate, today) > 730) &&
						(percentageDiscount < userType.getDiscountPercentage())) {
					percentageDiscount = userType.getDiscountPercentage();
				}				
			}
		}		
		
		double totalBillAmount = 0;
		Set<BillItem> billItems = bill.getBillItems();
		for (BillItem billItem : billItems) {
			if(billItem.getItem().getIsGroceryItem()) {
				//Do not apply percentage discounts if grocery items
				totalBillAmount += ((billItem.getItem().getPrice()) *
						(billItem.getQuantity()));
			} else {
				totalBillAmount += ((billItem.getItem().getPrice()) *
						(billItem.getQuantity()) * (1-percentageDiscount));
			}
		}
			
		totalBillAmount -= 5 * ((totalBillAmount - (totalBillAmount % 100)) / 100);
		
		return totalBillAmount;
	}
	
	public static int daysBetween(Calendar startDate, Calendar endDate) {
	    long start = startDate.getTimeInMillis();
	    long end = endDate.getTimeInMillis();

	    int presumedDays = (int) TimeUnit.MILLISECONDS.toDays(end - start);
	    startDate.add(Calendar.DAY_OF_MONTH, presumedDays);

	    if (startDate.before(endDate)) {
	        startDate.add(Calendar.DAY_OF_MONTH, 1);
	        ++presumedDays;
	    }
	    if (startDate.after(endDate)) {
	        --presumedDays;
	    }
	    return presumedDays;
	}

	
}
