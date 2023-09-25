/*
19] Find common elements in three sorted arrays
	Given three Sorted arrays in non-decreasing order, print all common elements in these arrays.

	Examples:
		Input:
			ar1[] = {1, 5, 10, 20, 40, 80}
			ar2[] = {6, 7, 20, 80, 100}
			ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
		Output: 20, 80
	
		Input:
			ar1[] = {1, 5, 5}
			ar2[] = {3, 4, 5, 5, 10}
			ar3[] = {5, 5, 10, 20}
		Output: 5, 5
 */

import java.util.*;

class Solution {
	
	ArrayList<Integer> findElement(int nums1[], int nums2[], int nums3[], int n) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();

		for(int i = 0; i < n; i++) {
			
			int flag1 = 0, flag2 = 0;
			for(int j = 0; j < nums2.length; j++) {
				
				if(nums1[i] == nums2[j]) {
					
					flag1 = 1;
				}
			}
			for(int k = 0; k < nums3.length; k++) {
				
				if(nums1[i] == nums3[k]) {
					
					flag2 = 1;
				}
			}
			if(flag1 == 1 && flag2 == 1) {
				
				al.add(nums1[i]);
			}
		}
		return al;
	}
	ArrayList<Integer> commonElement(int arr1[], int arr2[], int arr3[]) {
			
		int n = 0;
		if(arr1.length < arr2.length && arr1.length < arr3. length) {
			
			n = arr1.length;
			return findElement(arr1, arr2, arr3, n);
		} else if(arr2.length < arr1.length && arr2.length < arr3. length) {
			
			n = arr2.length;
			return findElement(arr2, arr1, arr3, n);
		} else {
			
			n = arr3.length;
			return findElement(arr3, arr1, arr2, n);
		}
	}

	public static void main(String[] args) {
		
		int arr1[] = new int[]{1, 5, 5};
		int arr2[] = new int[]{3, 4, 5, 5, 10};
		int arr3[] = new int[]{5, 5, 10, 20};

		System.out.println(new Solution().commonElement(arr1, arr2, arr3));
	}
}
