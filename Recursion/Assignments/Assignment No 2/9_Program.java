/*
 * 9] Write a program to determine whether a given number is a happy number or not.
 *    (A happy number is a number which eventually reaches 1 when replaced by the
 *    sum of the square of each digit.)
 */

class Solution {
	
	int squareSum(int num) {
		
		if(num == 0) {
			
			return 0;
		}
		return (int)(Math.pow(num % 10, 2)) + squareSum(num / 10);
	}
	boolean happyNumber(int num) {

		if(num < 10 && num != 1) {
			
			return false;
		}
		num = squareSum(num);
		if(num == 1) {
			return true;
		}
		return happyNumber(num);
	}
	public static void main(String[] args) {
		
		int num = 20;
		if(new Solution().happyNumber(num)) {
			
			System.out.println("Happy Number");
		} else {	

			System.out.println("Not Happy Number");
		}
	}
}
