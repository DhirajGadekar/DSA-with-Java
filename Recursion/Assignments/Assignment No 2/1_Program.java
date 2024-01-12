/*
 * 1] Write a program to print the factorial of a given number.
 */ 

class Solution {
	
	int factorial(int num) {
		
		if(num == 1) {
			
			return 1;
		}
		return num * factorial(--num);
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		System.out.println(obj.factorial(5));
	}
}
