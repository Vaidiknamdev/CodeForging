package com.mackinsey.practice2;

public class Product{
	private String category;
	private int stockQuantity;
	
	Product(){

	}
	public Product(String category, int stockQuantity) {
		this.category = category;
		this.stockQuantity = stockQuantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	
	
}
class ProductItem extends Product {
	private int productId;
	private String productName;
	private double productprice;
	private int quantity;
	private int minimumRequiredStock;
	public ProductItem(int productId, String productName, double productprice, int quantity, int minimumRequiredStock,String category,int stockQuantity) {
		super(category,stockQuantity);
		this.productId = productId;
		this.productName = productName;
		this.productprice = productprice;
		this.quantity = quantity;
		this.minimumRequiredStock = minimumRequiredStock;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getMinimumRequiredStock() {
		return minimumRequiredStock;
	}
	public void setMinimumRequiredStock(int minimumRequiredStock) {
		this.minimumRequiredStock = minimumRequiredStock;
	}
}
