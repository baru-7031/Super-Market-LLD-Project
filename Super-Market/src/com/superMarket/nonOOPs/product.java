package com.superMarket.nonOOPs;

public class product {
	
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuantity;
	private String productDescription;
	private String productType;
	
	
	public product(int productId, String productName, int productPrice, int productQuantity,
			String productDescription, String productType) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productDescription = productDescription;
		this.productType = productType;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public String getProductDescription() {
		return productDescription;
	}
	
	public String getProductType() {
		return productType;
	}
	
}
