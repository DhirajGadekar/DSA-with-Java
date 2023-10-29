/*
 * 3. WAP to print the sum of n natural numbers.
 */

class Solution {

	int printSum(int N) {

		int sum = 0;
		for(int i = 1;i <= N; i++) {
			
			sum = sum + i;
		}
		return sum;
	}
	int printSumN(int N) {
		
		if(N == 1) {
				
			return 1;
		}
		return N + printSumN(--N);
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();

		System.out.println(obj.printSum(10));
		System.out.println(obj.printSumN(10));
	}
}
