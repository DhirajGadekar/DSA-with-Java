/* *
 * 5. Write a Java recursive method to calculate the exponentiation of a number (base) raised to a power (exponent).
 */

class Solution {
	
	int exponentiationCal(int base, int exponent) {
		
		if(exponent == 1) {
			
			return base;
		}
		return base * exponentiationCal(base, --exponent);
	}
}
