/*
 21] First element to occur k times
	Given an array of N integers. Find the first element that occurs at least K number of times.
	
	Example 1:
		Input :
			N = 7, K = 2
			A[] = {1, 7, 4, 3, 4, 8, 7}
		Output :
			4
		Explanation:
			Both 7 and 4 occur 2 times.
			But 4 is first that occurs 2 times
			As at index = 4, 4 has occurred
			at least 2 times whereas at index = 6,
			7 has occurred at least 2 times.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)

	Constraints:
			1 <= N <= 10^4
			1 <= K <= 100
			1<= A[i] <= 200
 */

class Solution {
    
	int firstElementKTime(int[] a, int n, int k) {

        	for(int i = 0; i < a.length; i++) {

            		int count = 0;
            		for(int j = i; j >= 0; j--) {

                		if(a[i] == a[j]) {

                    			count++;
                		}
            		}
            		if(count >= k) {

                		return a[i];
            		}
        	}
        	return -1;
    	}
}
