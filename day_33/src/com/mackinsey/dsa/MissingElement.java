package com.mackinsey.dsa;

import java.util.ArrayList;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,4,4,5,2,2};
		List<Integer> result =missingElement(arr);
		System.out.println(result);
	}
	public static List<Integer> missingElement(int[] arr) {
		List<Integer> l = new ArrayList<>();
		for(int i =0;i<arr.length;i++) {
			int value = Math.abs(arr[i]);
			int position = value-1;
			if(arr[position]>0) {
			arr[position] = -arr[position];
			}
		}
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>0) {
				l.add(i+1);
			}
		}
		return l;
	}

}
