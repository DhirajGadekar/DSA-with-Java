/*
 * Problem 2:
	Given an array of non-negative integers representing a number, implement a function to
	simulate the carry forward operation that occurs when adding 1 to the number represented by
	the array. The array represents the digits of the number, where the 0th index is the least
	significant digit. Your task is to handle the carry forward operation correctly, updating the array
	accordingly. The function should return the resulting array.
	
	For example, given the input array [1, 9, 9], representing the number 199, the function should
	return [2, 0, 0], representing the result of adding 1 to 199 with the carry forward properly handled.
	
	Consider edge cases such as when the number has trailing zeros or when the carry forward
	results in an additional digit. Optimize your solution for efficiency and discuss the time and
	space complexity of your algorithm.
 */

import java.util.*;

class Solution {
	
	ArrayList<Integer> trailingZero(int arr[], int N) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		int carry = 1;
		for(int i = N - 1; i >= 0; i--) {
			
			al.add(0, (arr[i] + carry) % 10);
			carry = (arr[i] + carry) / 10;
		}
		if(carry != 0) {
			
			al.add(0, carry);
		}
		return al;
	}
	public static void main(String[] args) {

		int arr[] = new int[]{9,9,9};
		System.out.println(new Solution().trailingZero(arr, arr.length));
	}
}
