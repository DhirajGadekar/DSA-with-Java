/*
 * 8] Write a program to check whether a given positive integer is a Perfect Number or not.
 */

class Solution {
	
	int itr = 0;
	int perfectNum(int num) {
		itr++;
		if(itr == num) {
			
			return 0;
		}
		return ((num % itr == 0)? itr : 0) + perfectNum(num);
	}
	public static void main(String[] args) {
		
		int num = 28;
		if(num == new Solution().perfectNum(num)) {
			
			System.out.println("Perfect Number");
		} else {	

			System.out.println("Not Perfect Number");
		}
	}
}
