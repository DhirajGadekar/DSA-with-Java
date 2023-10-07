/*
4] Kth smallest element
	Given an array arr[] and an integer K where K is smaller than the size of the array,
	the task is to find the Kth smallest element in the given array. It is given that all
	array elements are distinct.
	Note :- l and r denotes the starting and ending index of the array.
	
	Example 1:
		Input:
			N=6
			arr[] = 7 10 4 3 20 15
			K=3
		Output : 7
		Explanation : 3rd smallest element in the given array is 7.
	Example 2:
		Input:
			N=5
			arr[] = 7 10 4 20 15
			K=4
		Output : 15
		Explanation : 4th smallest element in the given array is 15.

	Expected Time Complexity: O(n)
	Expected Auxiliary Space: O(log(n))

	Constraints:
			1 <= N <= 105
			1 <= arr[i] <= 105
			1 <= K <= N
 */

import java.util.*;
class Solution{
    	
	int kthSmallest(int[] arr, int l, int r, int k) { 
        	
		SortedSet<Integer> s = new TreeSet<Integer>();
        	for(int i = 0; i < arr.length; i++) {
            
            		s.add(arr[i]);
        	}
        	int kth = Integer.MAX_VALUE;

       	 	Object nums[] = s.toArray();
        	return (int)nums[k - 1];
    	}	 
}
