package com.mackinsey.practice2;

public class WareHouseInventoryAuditApplication {
    
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		ProductItem p1  = new ProductItem(1, "iPhone 13 mini", 10001, 699,  300, "electronics", 1500);
		ProductItem p2  = new ProductItem(2, "iPhone 13",      10002, 799,  400, "electronics", 2500);
		ProductItem p3  = new ProductItem(3, "iPhone 14",      10003, 899,  450, "electronics", 3000);
		ProductItem p4  = new ProductItem(4, "iPhone 14 Plus", 10004, 999,  500, "electronics", 1800);
		ProductItem p5  = new ProductItem(5, "wheat 15",      10005, 1099, 550, "Food", 3500);
		ProductItem p6  = new ProductItem(6, "Rice", 10006, 1199, 600, "Food", 2000);
		ProductItem p7  = new ProductItem(7, "iPhone 15 Pro",  10007, 1299, 650, "electronics", 4000);
		ProductItem p8  = new ProductItem(8, "iPhone 16",      10008, 1399, 700, "electronics", 5000);
		ProductItem p9  = new ProductItem(9, "iPhone 16 Plus", 10009, 1499, 750, "electronics", 2200);
		ProductItem p10 = new ProductItem(10, "iPhone 16 Pro", 10010, 1599, 800, "electronics", 4500);
		ProductItem p11 = new ProductItem(11, "iPhone 17 Pro", 10011, 1699, 850, "electronics", 6000);
		
		ProductItem[] pArray = new ProductItem[12];
			pArray[0] = p1;
			pArray[1] = p2;
			pArray[2] = p3;
			pArray[3] = p4;
			pArray[4] = p5;
			pArray[5] = p6;
			pArray[6] = p7;
			pArray[7] = p8;
			pArray[8] = p9;
			pArray[9] = p10;
			pArray[10] = p11;	
			
		WareHouse wareHouse = new WareHouse(420, "SheetalWareHouse","pandhana",pArray);
		
		for(int i =0;i<=pArray.length;i++) {
			System.out.println(pArray[i].getStockQuantity());
		}
			
		
	}

}
