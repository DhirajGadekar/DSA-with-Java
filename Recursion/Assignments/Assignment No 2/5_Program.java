/*
 * 5] Write a program to check whether the given number is a palindrome number or not.
 */
class Solution {
	int sum = 0;
	int checkPalindromeNum(int num) {

		if(num == 0) {

			return sum;
		}
		sum = (sum * 10) + num % 10;
		return checkPalindromeNum(num / 10);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		int num = 12321;
		if(obj.checkPalindromeNum(num) == num) {

			System.out.println("Palindrome");
		} else {

			System.out.println("Not Palindrome");
		}
	}
}
