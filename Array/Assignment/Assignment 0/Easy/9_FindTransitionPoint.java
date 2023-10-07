/*
Que 9 : Find transition Point
	Given a sorted array containing only 0s and 1s, find the transition point.

	Example 1:
		Input:
			N=5
			arr[] = {0,0,0,1,1}
		Output: 3
		Explanation: index 3 is the transition point where 1 begins.

	Example 2:
		Input:
			N=4
			arr[] = {0,0,0,0}
		Output: -1
		Explanation: Since, there is no "1", the answer is -1.

	Expected Time Complexity: O(LogN)
	Expected Auxiliary Space: O(1)

	Constraints:
		1 ≤ N ≤ 500000
		0 ≤ arr[i] ≤ 1
 */

class Solution {
    	
	int transitionPoint(int arr[], int n) {

        	for(int i = 0; i < n; i++) {

            		if(arr[i] == 1) {

                		return i;
            		}
        	}
        	return -1;
    	}
}
