package com.mackinsey.practice0;

import java.util.Arrays;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Cart cart = new Cart(1,"iphone",129894353,1);
		Cart cart1 = new Cart(2,"samsung",129893,1);
		Cart cart2 = new Cart(3,"jio",12983,1);
		Cart cart3 = new Cart(4,"readmi",1293,1);
		Cart cart4 = new Cart(5,"ipad",1273,1);
		
		Cart[] carts = new Cart[5];
		
		carts[0] = cart;
		carts[1] = cart1;
		carts[2] = cart2;
		carts[3] = cart3;
		carts[4] = cart4;
		
//		System.out.println(Arrays.toString(carts));
		
		System.out.println(carts[1]);
		System.out.println(carts[2]);
		
		
	}

}
