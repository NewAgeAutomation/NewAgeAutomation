package com.newageautomation;

import java.util.HashSet;
import java.util.Set;

public class Bill {
	private Set<BillItem> billItems;
	
	public Bill (){
		//default constructor;
		billItems = new HashSet<BillItem>();
	}
	public Bill (Set<BillItem> billItems){
		this.billItems = billItems;
	}
	
	public boolean addItemToBill(BillItem billItem) {
		for(BillItem bItem : billItems) {
			if(bItem.getItem().getItemSkuId().equals(billItem.getItem().getItemSkuId())) {
				//To-Do: Replace this if condition by overriding equals method in BillItem.
				return false;
			}
		}
		return billItems.add(billItem);
	}
	
	public Set<BillItem> getBillItems() {
		return billItems;
	}
	
}










