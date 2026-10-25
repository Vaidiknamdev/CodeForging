package com.mackinsey.practice2;
/**
 * WareHouse class is responsible for the storage of all the type of products
 */
public class WareHouse {
	private int wareHouseId;
	private String wareHouseName;
	private String wareHouseAddress;
	private ProductItem[] productItem;
	
	WareHouse(){
		
	}
	public WareHouse(int wareHouseId, String wareHouseName, String wareHouseAddress, ProductItem[] productItem) {
		
		this.wareHouseId = wareHouseId;
		this.wareHouseName = wareHouseName;
		this.wareHouseAddress = wareHouseAddress;
		this.productItem = productItem;
	}
    //getters and setters
	public int getWareHouseId() {
		return wareHouseId;
	}

	public void setWareHouseId(int wareHouseId) {
		this.wareHouseId = wareHouseId;
	}

	public String getWareHouseName() {
		return wareHouseName;
	}

	public void setWareHouseName(String wareHouseName) {
		this.wareHouseName = wareHouseName;
	}

	public String getWareHouseAddress() {
		return wareHouseAddress;
	}

	public void setWareHouseAddress(String wareHouseAddress) {
		this.wareHouseAddress = wareHouseAddress;
	}

	public ProductItem[] getProduct() {
		return productItem;
	}

	public void setProduct(ProductItem[] productItem) {
		this.productItem = productItem;
	}	
}
