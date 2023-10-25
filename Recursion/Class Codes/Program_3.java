/*
 * 3] Sum of Digits using loop and recursion :
 */

class Recursion {
	
	void sumofDigits(int num) {
		
		int sum = 0;
		while(num != 0) {
			
			sum = sum + num % 10;
			num /= 10;
		}
		System.out.println(sum);
	}
	int sumOfDigit(int num) {
		
		if(num == 0) {

			return 0;
		}
		return num % 10 + sumOfDigit(num / 10);
	}
	public static void main(String[] args) {

		Recursion obj = new Recursion();
		obj.sumofDigits(123);
		System.out.println(obj.sumOfDigit(345));
	}
}
