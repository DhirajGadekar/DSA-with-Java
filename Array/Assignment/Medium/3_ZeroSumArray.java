/*

3] Zero Sum Subarrays
	You are given an array arr[] of size n. Find the total count of sub-arrays having
	their sum equal to 0.
	
	Example 1:
		Input:
			n=6
			arr[] = {0,0,5,5,0,0}
		Output: 6
		Explanation: The 6 subarrays are [0], [0], [0], [0], [0,0], and [0,0].
	Example 2:
		Input:
			n = 10
			arr[] = {6,-1,-3,4,-2,2,4,6,-12,-7}
		Output: 4
		Explanation: The 4 subarrays are [-1 -3 4] [-2 2], [2 4 6 -12], and [-1 -3 4 -2 2]
	Expected Time Complexity: O(n*log(n))
	Expected Auxiliary Space: O(n)
	Constraints:
		1 <= n <= 10^6
		-10^9 <= arr[ i ] <= 10^9
 */

class Solution {

    	long findSubarray(long[] arr ,int n) {

        	long count = 0;
        	for(int i = 1; i < n; i++) {

            		arr[i] = arr[i] + arr[i - 1];
        	}
       	 	for(int i = 0; i < n; i++) {

            		for(int j = i; j < n; j++) {

                		long sum = 0;
                		if(i == 0) {

                    			sum = arr[j];
                		} else {

                    			sum = arr[j] - arr[i - 1];
                		}
                		if(sum == 0) {

                    			count++;
                		}
            		}
        	}
        	return count;
    	}
}
