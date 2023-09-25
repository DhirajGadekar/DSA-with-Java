/*
 14] Maximum repeating number
	Given an array Arr of size N, the array contains numbers in range from 0 to K-1
	where K is a positive integer and K <= N. Find the maximum repeating number in
	this array. If there are two or more maximum repeating numbers return the element
	having least value.
	
	Example 1:
		Input:
			N = 4, K = 3
			Arr[] = {2, 2, 1, 2}
		Output: 2
		Explanation: 2 is the most frequent element.

	Example 2:
		Input:
			N = 6, K = 3
			Arr[] = {2, 2, 1, 0, 0, 1}
		Output: 0
			Explanation: 0, 1 and 2 all have the same frequency of 2.But since 0 is
			smallest, you need to return 0.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(K)
	Constraints:
		1 <= N <= 10^7
		1 <= K <= N
		0 <= Arri <= K - 1
 */

import java.util.*;

class Solution {
    	
	int maxRepeating(int[] arr, int n, int k) {
        
        	Arrays.sort(arr);
        
        	int temp = arr[0];
        	int count = 0;
        	int max = 0;
        	int maxEle = -1;
        	
		for(int i = 0; i < n; i++) {
                
            		if(temp == arr[i]) {
                
                		count++;
            		} else {
                
                		if(max < count) {
                    
                   	 		max = count;
                    			maxEle = temp;
                		}
                		count = 0;
                		temp = arr[i];
                		i--;
            		}
		}
            	if(max < count) {
                    
                    	max = count;
                    	maxEle = temp;
            	}
        	return maxEle;
    	}
}
