/*
 * 2. WAP to display the first 10 natural numbers in reverse order.
 */

class Solution {
	
	void printFirstN(int N) {
		
		for(int i = N; i >= 1; i--) {
		
			System.out.println(i);
		}
	}
	void printFirstNRev(int N) {

		if(N == 0) {

			return;
		}
		System.out.println(N);
		printFirstNRev(--N);
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		obj.printFirstN(10);
		obj.printFirstNRev(10);

	}
}
