/*
 * 7] Write a program to check if a given number is a Magic Number or not. (A Magic
 *    Number is a number in which the eventual sum of the digits is equal to 1).
 */

class Solution {
	
	int sumOfDigit(int num) {
		
		if(num == 0) {
			
			return 0;
		}
		return (num % 10) + sumOfDigit(num / 10);
	}
	boolean magicNumber(int num) {
		
		if(num < 10 && num != 0) {
			
			return false;
		}
		num = sumOfDigit(num);
		if(num == 1) {
			
			return true;
		}
		return magicNumber(num);
	}
	public static void main(String[] args) {
		
		if(new Solution().magicNumber(1729)) {
			
			System.out.println("Magic Number");
		} else {
			
			System.out.println("Not Magic Number");
		}
	}
}
