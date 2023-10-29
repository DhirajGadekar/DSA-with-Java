/*
 * 7. WAP to find the factorial of a number.
 */

class Solution {
	
	int factorial(int num) {
		
		int fact = 1;
		for(int i = 1;i <= num; i++) {
			
			fact = fact * i;
		}
		return fact;
	}
	int factorialNum(int Num) {
		
		if(Num == 1) {
			
			return 1;
		}
		return Num * factorialNum(--Num);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		System.out.println(obj.factorial(5));
		System.out.println(obj.factorialNum(5));
	}
}
