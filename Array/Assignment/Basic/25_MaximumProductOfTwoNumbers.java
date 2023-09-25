/*
 25] Maximum product of two numbers
	Given an array Arr of size N with all elements greater than or equal to zero. Return
	the maximum product of two numbers possible.
	
	Example 1:
		Input:
			N=6
			Arr[] = {1, 4, 3, 6, 7, 0}
		Output: 42
	
	Example 2:
		Input:
			N=5
			Arr = {1, 100, 42, 4, 23}
		Output: 4200

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
		2 ≤ N ≤ 10^7
		0 ≤ Arr[i] ≤ 10^4
 */

class Solution {
  
      	int maxProduct(int arr[], int n) {

        	int max1 = Integer.MIN_VALUE;
        	int max2 = Integer.MIN_VALUE;

        	for(int i = 0; i < n; i++) {

            		if(max1 <= arr[i]) {

                		max2 = max1;
                		max1 = arr[i];
            		} else if(max2 <= arr[i] && arr[i] != max1) {

                		max2 = arr[i];
            		}
        	}
        	return max1 * max2;
    	}
}
