/*
 24] Ceil The Floor
	Given an unsorted array Arr[] of N integers and an integer X, find floor and ceiling
	of X in Arr[0..N-1].
	Floor of X is the largest element which is smaller than or equal to X. Floor of X
	doesn’t exist if X is smaller than the smallest element of Arr[].
	Ceil of X is the smallest element which is greater than or equal to X. Ceil of X
	doesn’t exist if X is greater than the greatest element of Arr[].

	Example 1:
		Input:
			N = 8, X = 7
			Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
		Output: 6 8
		Explanation:
			Floor of 7 is 6 and ceil of 7 is 8.
	
	Example 2:
		Input:
			N = 8, X = 10
			Arr[] = {5, 6, 8, 9, 6, 5, 5, 6}
		Output: 9 -1
		Explanation:
			Floor of 10 is 9 but ceil of 10 is not possible.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	
	Constraints :
		1 ≤ N ≤ 10^5
 */

import java.util.*;

class Solution {
    
      	ArrayList<Integer> getFloorAndCeil(int[] arr, int n, int x) {

		ArrayList<Integer> al = new ArrayList<Integer>();
        	
		Arrays.sort(arr);
        	int Floor = -1;
        	int Ceil = -1;
        	int itr = arr.length - 1;
        	for(int i = 0; i < n; i++) {

            		if(x >= arr[i]) {

                		Floor = arr[i];
            		}
            		if(arr[(itr - i)] >= x) {

                		Ceil = arr[(itr - i)];
            		}
        	}

		al.add(Floor);
		al.add(Ceil);
        	return al;
    	}
}
