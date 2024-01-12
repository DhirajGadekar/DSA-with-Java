/*
 * 2] Write a program to print the product of digits of a given number.
 */

class Solution {
	
	int productOfDigit(int digit) {
		
		if(digit == 0) {
			return 1;
		}
		return (digit % 10) * productOfDigit(digit / 10);
	}
	public static void main(String[] args) {
		
		System.out.println(new Solution().productOfDigit(1234));
	}
}
