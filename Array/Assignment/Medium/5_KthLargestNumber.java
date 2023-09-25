/*
5] k largest elements
	Given an array Arr of N positive integers and an integer K, find K largest elements
	from the array. The output elements should be printed in decreasing order.
	
	Example 1:
		Input:
			N = 5, K = 2
			Arr[] = {12, 5, 787, 1, 23}
		Output: 787 23
		Explanation: 1st largest element in the array is 787 and second largest is 23.
	Example 2:
		Input:
			N = 7, K = 3
			Arr[] = {1, 23, 12, 9, 30, 2, 50}
			Output: 50 30 23
		Explanation: 3 Largest element in the array are 50, 30 and 23.
	
	Expected Time Complexity: O(K+(N-K)*logK)
	Expected Auxiliary Space: O(K+(N-K)*logK)
	
	Constraints:
		1 ≤ K ≤ N ≤ 10^5
		1 ≤ Arr[i] ≤ 10^6
 */

import java.util.*;
class Solution {

    	ArrayList<Integer> kLargest(int arr[], int n, int k) {

        	Arrays.sort(arr);
        	ArrayList<Integer> al = new ArrayList<Integer>();
        	int itr = arr.length - 1;
        	for(int i = 0;i < k; i++) {

            		al.add(arr[itr]);
            		itr--;
        	}
        	return al;
    	}
}
