/*
Que 15 : Union of two sorted Array
	Union of two arrays can be defined as the common and distinct elements in the two
	arrays.
	Given two sorted arrays of size n and m respectively, find their union.

	Example 1:
		Input:
			n = 5, arr1[] = {1, 2, 3, 4, 5}
			m = 3, arr2 [] = {1, 2, 3}
		Output: 1 2 3 4 5
		Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.

	Example 2:
		Input:
			n = 5, arr1[] = {2, 2, 3, 4, 5}
			m = 5, arr2[] = {1, 1, 2, 3, 4}
		Output: 1 2 3 4 5
		Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.

	Example 3:
		Input:
			n = 5, arr1[] = {1, 1, 1, 1, 1}
			m = 5, arr2[] = {2, 2, 2, 2, 2}
		Output: 1 2
	Explanation: Distinct elements including both the arrays are: 1 2.
	
	Expected Time Complexity: O(n+m).
	Expected Auxiliary Space: O(n+m).
	
	Constraints:
		1 <= n, m <= 105
		1 <= arr[i], brr[i] <= 106
 */

import java.util.*;

class Solution {
	
	ArrayList<Integer> unionOfArray(int arr1[], int arr2[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int itr1 = 0, itr2 = 0;

		while(itr1 < arr1.length && itr2 < arr2.length) {
			
			if(arr1[itr1] < arr2[itr2]) {
				
				if(!al.contains(arr1[itr1])) {
					
					al.add(arr1[itr1]);
				}
					itr1++;
			} else {
				
				if(!al.contains(arr2[itr2])) {

					al.add(arr2[itr2]);
				}
				itr2++;
			}
		}
		while(itr1 < arr1.length) {
			
			if(!al.contains(arr1[itr1])) {
				
				al.add(arr1[itr1]);
			}
			itr1++;
		}
		
		while(itr2 < arr2.length) {
			
			if(!al.contains(arr2[itr2])) {
				
				al.add(arr2[itr2]);
			}
			itr2++;
		}
		System.out.println(al.get(3));
		return al;
	}
	public static void main(String[] args) {
		
		int arr1[] = {1, 2, 3, 4};
		int arr2[] = {1, 1};
		System.out.println(new Solution().unionOfArray(arr1, arr2));
	}
}
