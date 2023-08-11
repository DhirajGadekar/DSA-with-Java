/* *
 * Qu 3. Write a Java recursive method to calculate the nth Fibonacci number.
 */

class Solution {
	
	int fibonacciSeries(int n) {
	
		if(n == 1) {
			
			return 1;
		}
		if(n == 0) {
			
			return 0;
		}
		return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
	}
}
