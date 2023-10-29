/*
 * 10. WAP to check whether the given number is palindrome or not.
 */

class Solution {
	
	boolean checkPalindrome(int num) {
		
		int temp = num;
		int sum = 0;
		while(temp != 0) {
			
			sum = (sum * 10) + temp % 10;
			temp /= 10;
		}
		if(num == sum) {
			
			return true;
		} else {
		
			return false;
		}
	}
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
