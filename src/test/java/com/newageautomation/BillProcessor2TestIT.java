package com.newageautomation;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class BillProcessor2TestIT {
    
	@Test
    public void SimpleTest2() {
        //Employee and Customer
        User user = createTestUser();
        Bill bill = createBill();
        assertThat(151.785, is(equalTo(BillProcessor.processBill(bill, user))));
    }
	
	public User createTestUser() {
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
	
	public Bill createBill(){
		Bill bill = new Bill();
		bill.addItemToBill(new BillItem((new Item("1001-Kelloggs",26.98,true)),3));
		bill.addItemToBill(new BillItem((new Item("1002-Milk",12.99,true)),1));
		bill.addItemToBill(new BillItem((new Item("1003-Spoon",4.99,false)),5));
		bill.addItemToBill(new BillItem((new Item("1004-Bowl",26,false)),2));
		bill.addItemToBill(new BillItem((new Item("1005-Sugar",8.99,true)),1));		
		return bill;
	}

}














