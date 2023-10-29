/*
 * 4. WAP to print the length of digits in a number.
 */

class Solution {
	
	int printLength(int N) {
		
		int count = 0;
		while(N != 0) {
	
			count++;
			N /= 10;
		}
		return count;
	}	
	int printDigitLen(int N) {

		if(N == 0) {
			return 1;
		}
		return 1 + printDigitLen(N / 10);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		System.out.println(obj.printLength(1234));
		System.out.println(obj.printLength(1234));
	}
}
