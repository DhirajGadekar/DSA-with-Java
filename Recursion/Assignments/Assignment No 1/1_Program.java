/*
 * 1. WAP to print the numbers between 1 to 10.
 */

class Solution {
	
	void usingForLoop(int N) {
	
		for(int i = 1; i <= N; i++) {
			
			System.out.println(i);
		}
	}
	void printN(int N) {
		
		if(N == 0) {
			
			return;
		}
		printN(--N);
		System.out.println(N + 1);
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		obj.usingForLoop(10);
		obj.printN(10);
	}
}
