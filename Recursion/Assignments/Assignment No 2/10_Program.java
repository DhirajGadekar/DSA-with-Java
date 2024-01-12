/*
 * 10] Write a program to check if a given number is an Armstrong number or not.
 * ( An Armstrong number is a number that is equal to the sum of its own digits each
 * raised to the power of the number of digits.)
 */

class Solution {
	
	int countOfDigit(int num) {
		
		if(num == 0) {
		
			return 0;
		}
		return 1 + countOfDigit(num / 10);
	}
	int sumOfDigit(int count, int num) {
		
		if(num == 0) {

			return 0;
		}
		return (int)Math.pow((num % 10), count) + sumOfDigit(count, num / 10);
	}
	int armStrongNum(int num) {
		
		return sumOfDigit(countOfDigit(num), num);
	}
	public static void main(String[] args) {
		
		int num = 1634;
		if(num == new Solution().armStrongNum(num)) {
			
			System.out.println("ArmStrong Number");
		} else {
			
			System.out.println("Not ArmStrong Number");
		}
	}
}
