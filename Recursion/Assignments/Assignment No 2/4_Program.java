/*
 * 4] Write a program to print the sum of odd numbers up to a given number.
 */

class Solution {
	
	int sumOfOddNumber(int num) {
		
		if(num == 1) {
			
			return 1;
		}
		return ((num % 2 == 1)? num : 0) + sumOfOddNumber(--num);
	}
	public static void main(String[] args) {
		
		System.out.println(new Solution().sumOfOddNumber(10));
	}
}
