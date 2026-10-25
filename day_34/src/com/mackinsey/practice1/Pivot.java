package com.mackinsey.practice1;

public class Pivot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 7, 3, 6, 5, 6 };
		int n = Pivot.pivotIndex(arr);
		System.out.println(n);

	}

	public static int pivotIndex(int[] nums) {
		int sumOnLeft = 0;
		int sumOnRight = 0;
		// for(int i =0;i<=pivot;i++){
		// sumOnLeft = sumOnLeft + nums[i];
		// }
		// for(int i = pivot+1;i<nums.length;i++){
		// sumOnRight = sumOnRight + nums[i];
		// }
		for (int i = 0; i < nums.length; i++) {
			int pivot = i;
			if (pivot - i - 1 < 0) {
				sumOnLeft = 0;
			} else {
				sumOnLeft = sumOnLeft + nums[pivot - i - 1];
			}
			if (pivot - 1 == nums.length) {
				sumOnRight = 0;
			} else {
				sumOnRight = sumOnRight + nums[pivot + 1];
			}
			if (sumOnLeft == sumOnRight) {
				return nums[pivot];
			}

		}

		return -1;
	}
}
