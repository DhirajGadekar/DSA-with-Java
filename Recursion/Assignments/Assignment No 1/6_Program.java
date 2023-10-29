/*
 * 6. WAP to calculate the sum of digits of a given positive integer.
 */

class Solution {
	
	int sumOfPosDigit(int digit) {
			
		int sum = 0;
		while(digit != 0) {
		
			sum = sum + digit % 10;
			digit /= 10;
		}
		return sum;
	}
	int sumOfDigit(int digit) {
		
		if(digit == 0) {

			return 0;
		}
		return digit % 10 + sumOfDigit(digit / 10);
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		System.out.println(obj.sumOfDigit(4123));
		System.out.println(obj.sumOfPosDigit(1234));
	}
}
