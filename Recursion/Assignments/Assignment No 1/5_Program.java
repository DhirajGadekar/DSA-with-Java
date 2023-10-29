/*
 * 5. WAP to check whether the number is prime or not.
 */ 

class Solution {
	
	boolean checkPrime(int N) {
		
		int count = 0;
		for(int i = 2; i <= N/2; i++) {
			
			if(N % i == 0) {
			
				count++;
			}
		}
		if(count >= 1) {

			return false;
		} else {
			
			return true;
		}
	}
	int checkPrimeNum(int itr, int N) {
	
		if(itr > N) {
			
			return 0;
		}

		return ((N % itr == 0)? 1 : 0) + checkPrimeNum(++itr, N);
	}
	public static void main(String[] args) {

		Solution obj = new Solution();
		System.out.println(obj.checkPrimeNum(1, 73));
		if(obj.checkPrimeNum(1, 73) == 2) {
			
			System.out.println("Prime");
		} else {
			
			System.out.println("Not Prime");
		}
	}
}
