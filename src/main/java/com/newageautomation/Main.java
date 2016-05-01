package com.newageautomation;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
        User user = createTestUser1();
        Bill bill = createBill1();
        System.out.println("Bill 1 Total = " + BillProcessor.processBill(bill, user));

        User user2 = createTestUser2();
        System.out.println("Bill 2 Total = " + BillProcessor.processBill(bill, user2));
        
	}

	public static User createTestUser1() {
		try {
			UserBuilder userBuilder = new UserBuilder();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse("01/05/2014");
			User user = userBuilder.createUser(101, "password", false,
					false, true, date);
			return user;
		} catch (Exception ex) {
			ex.printStackTrace(); // To-Do: Log in debug
			return null;
		}
	}
	
	public static Bill createBill1(){
		Bill bill = new Bill();
		bill.addItemToBill(new BillItem((new Item("1001-Kelloggs",26.98,true)),3));
		bill.addItemToBill(new BillItem((new Item("1002-Milk",12.99,true)),1));
		bill.addItemToBill(new BillItem((new Item("1003-Spoon",4.99,false)),5));
		bill.addItemToBill(new BillItem((new Item("1004-Bowl",26,false)),2));
		bill.addItemToBill(new BillItem((new Item("1005-Sugar",8.99,true)),1));		
		return bill;
	}
	
	public static User createTestUser2() {
		try {
			UserBuilder userBuilder = new UserBuilder();
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse("01/05/2014");
			User user = userBuilder.createUser(102, "password", true,
					false, true, date);
			return user;
		} catch (Exception ex) {
			ex.printStackTrace(); // To-Do: Log in debug
			return null;
		}
	}

	
}
