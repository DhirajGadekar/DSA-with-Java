/*
 22] Exceptionally odd
	Given an array of N positive integers where all numbers occur even number of
	times except one number which occurs odd number of times. Find the exceptional
	number.

	Example 1:
		Input:
			N=7
			Arr[] = {1, 2, 3, 2, 3, 1, 3}
		Output: 3
		Explanation: 3 occurs three times.

	Example 2:
		Input:
			N=7
			Arr[] = {5, 7, 2, 7, 5, 2, 5}
		Output: 5
		Explanation: 5 occurs three times.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
		1 ≤ N ≤ 10^5
		1 ≤ arr[i] ≤ 10^6
 */

import java.util.*;

class Solution {
    	int getOddOccurrence(int[] arr, int n) {

        	Arrays.sort(arr);
        	
		int temp = arr[0];
        	int count = 0;
        	
		for(int i = 0; i < n; i++) {

            		if(temp == arr[i]) {

                		count++;
            		} else {

                		if(count % 2 != 0) {

                    			return temp;
                		}
                		count = 0;
                		temp = arr[i];
                		i--;
            		}
        	}
        	if(count % 2 != 0) {

            		return temp;
        	} else {

            		return 0;
        	}
    	}
}
