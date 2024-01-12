/*
 * 3] Write a program to print the maximum digit in a given number.
 */

class Solution {
	
	int max = Integer.MIN_VALUE;
	int maximumDigit(int num) {

		if(num == 0) {

			return max;
		}
		if((num % 10) > max) {
			
			max = num % 10;
		}
		return maximumDigit(num / 10);
	}
	public static void main(String[] args) {

		System.out.println(new Solution().maximumDigit(372));
	}
}
