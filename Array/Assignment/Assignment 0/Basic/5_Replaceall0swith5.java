/*
 5] Replace all 0's with 5
	You are given an integer N. You need to convert all zeros of N to 5.
	
	Example 1:
		Input:
			N = 1004
		Output: 1554
		Explanation: There are two zeroes in 1004
			     on replacing all zeroes with "5", the new
			     number will be "1554".
	Example 2:
		Input:
			N = 121
		Output: 121
		Explanation: Since there are no zeroes in
			     "121", the number remains as "121".
	Expected Time Complexity: O(K) where K is the number of digits in N
	Expected Auxiliary Space: O(1)

	Constraints:
		1 <= n <= 10000
 */

class Solution {
	
	int convertFive(int n) {
        
        	int temp = 0;
        	while(n != 0) {
			int rem = n % 10;
            		if(rem == 0) {
                		
				temp = (temp * 10) + 5;
            		} else {
                		
				temp = (temp * 10) + rem;
            		}
           	 	n /= 10;
        	}
        	while(temp != 0) {
           
           		int rem = temp % 10;
            		n = (n * 10) + rem;
            		temp /= 10;
        	}
        	return n;
    	}
}
