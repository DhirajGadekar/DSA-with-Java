/* *
 * Qu 1. Write a Java recursive method to calculate the factorial of a given positive integer. 
 */

class Solution {
	
	int factorialCal(int n) {
		
		if(n == 1) {
			
			return 1;
		}
		return n * factorialCal(--n);
	}
}
