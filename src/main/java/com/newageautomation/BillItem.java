package com.newageautomation;

public class BillItem {
	
	private Item item;
	private int quantity;

	public BillItem (Item item, int quantity) {
		setItem(item);
		setQuantity(quantity);
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem (Item item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity (int quantity) {
		this.quantity = quantity;
	}
	
}
