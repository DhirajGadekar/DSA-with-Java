/*
 * 6] Write a program to check whether a given number is a Strong Number or not.
 */

class Solution {

	int factorial(int num) {
		
		if(num == 1) {
			
			return 1;
		}
		return num * factorial(--num);
	}
	int strongNumber(int num) {
		
		if(num == 0) {
			
			return 0;
		}
		return factorial(num % 10) + strongNumber(num / 10);
	}
	public static void main(String[] args) {
		int num = 146;
		if(new Solution().strongNumber(num) == num) {

			System.out.println("Strong Number");
		} else {

			System.out.println("Not Strong Number");
		}
	}
}
