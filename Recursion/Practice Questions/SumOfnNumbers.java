/* *
 * Qu 2. Write a Java recursive method to calculate the sum of all numbers from 1 to n.
 */

class Solution {
	
	int sumAllNum(int n) {
		
		if(n <= 1) {
			
			return n;
		}
		return n + sumAllNum(n - 1);
	}
}
