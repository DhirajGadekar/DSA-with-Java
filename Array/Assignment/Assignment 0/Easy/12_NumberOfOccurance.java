/*
Que 12 : Number of occurance
	Given a sorted array Arr of size N and a number X, you need to find the number of
	occurrences of X in Arr.

	Example 1:
		Input:
			N = 7, X = 2
			Arr[] = {1, 1, 2, 2, 2, 2, 3}
		Output: 4
		Explanation: 2 occurs 4 times in the given array.

	Example 2:
		Input:
			N = 7, X = 4
			Arr[] = {1, 1, 2, 2, 2, 2, 3}
		Output: 0
		Explanation: 4 is not present in the given array.

	Expected Time Complexity: O(logN)
	Expected Auxiliary Space: O(1)

	Constraints:
		1 ≤ N ≤ 105
		1 ≤ Arr[i] ≤ 106
		1 ≤ X ≤ 106
 */

class Solution {
    	
	int count(int[] arr, int n, int x) {

        	int count = 0;
        	for(int i = 0; i < n; i++) {

            		if(arr[i] == x) {
             
			     	count++;
            		}
            		if(arr[i] > x) {

                		break;
            		}
        	}
        	return count;
    	}
}
