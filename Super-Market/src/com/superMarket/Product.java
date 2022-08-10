package com.superMarket;

public class Product {
	
	
	private String productName;
	private int quantity;
	private int productPrice;
	
	// object initialization 
	public Product(String productName, int quantity, int productPrice) {
		this.productName = productName;
		this.quantity = quantity;
		this.productPrice = productPrice;
	}
	
	// product name getter
	public String getProductName() {
		return productName;
	}
	
	// product name setter
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	// product quantity getter
	public int getQuantity() {
		return quantity;
	}
	
	// product quantity setter
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// product price getter
	public int getProductPrice() {
		return productPrice;
	}
	
	// product price setter
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	
	

}
