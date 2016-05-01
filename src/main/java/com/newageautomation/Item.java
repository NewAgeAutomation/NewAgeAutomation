package com.newageautomation;

public class Item {

	private String itemSkuId;
	private double price;
	private boolean isGroceryItem;
	
	public Item (String itemSkuId, double price, boolean isGroceryItem) {
		setItemSkuId(itemSkuId);
		setPrice(price);
		setIsGroceryItem(isGroceryItem);
	}
	
	public String getItemSkuId() {
		return itemSkuId;
	}
	
	public void setItemSkuId (String itemSkuId) {
		this.itemSkuId = itemSkuId;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public boolean getIsGroceryItem() {
		return isGroceryItem;
	}
	
	public void setIsGroceryItem(boolean isGroceryItem) {
		this.isGroceryItem = isGroceryItem;
	}
	
}






