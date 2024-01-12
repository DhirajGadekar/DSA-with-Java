/*
 * 11] Write a program to check if a given number is a Harshad Number or not.
 *     (A Harshad Number is a number that is divisible by the sum of its digits.)
 */

class Solution {
	
	int harshadNumber(int num) {
		
		if(num == 0) {

			return 0;
		}
		return num % 10 + harshadNumber(num / 10);
	}
	public static void main(String[] args) {
		
		int num = 121;
		if(num % new Solution().harshadNumber(num) == 0) {
			
			System.out.println("Harshad Number");
		} else {

			System.out.println("Not Harshad Number");
		}
	}
}
