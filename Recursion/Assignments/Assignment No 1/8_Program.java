/*
 * 8. WAP to count the occurrence of a specific digit in a given number.
 */

class Solution {

	int countSpecDigit(int digit, int num) {
		
		int count = 0;
		while(digit != 0) {
			
			if((digit % 10) == num) {
				
				count++;
			}
			digit /= 10;
		}
		return count;
	}
	int countDigitSpecNum(int digit, int num) {
		
		if(digit == 0) {
			
			return 0;
		}
		return (((digit % 10) == num)? 1 : 0) + countDigitSpecNum(digit / 10, num);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		System.out.println(obj.countSpecDigit(10001, 1));
		System.out.println(obj.countDigitSpecNum(10001, 1));
	}
}
