/*
 28] Remove Duplicates from unsorted array
	Given an array of integers which may or may not contain duplicate elements. Your
	task is to remove duplicate elements, if present.

	Example 1:
		Input:
			N=6
			A[] = {1, 2, 3, 1, 4, 2}
		Output:
			1 2 3 4
		Example 2:

		Input:
			N=4
			A[] = {1, 2, 3, 4}
		Output:
			1 2 3 4

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)
	
	Constraints:
		1<=N<=10^5
		1<=A[i]<=10^5
 */

import java.util.*;

class Solution {

    	ArrayList<Integer> removeDuplicate(int A[], int N) {

        	ArrayList<Integer> al = new ArrayList<Integer>();

        	al.add(A[0]);

        	for(int i = 1; i < A.length; i++) {

            		if(!al.contains(A[i])) {

                		al.add(A[i]);
            		}
        	}
		
        	return al;
    	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 2, 3, 1, 4, 2};
		ArrayList<Integer> al = new Solution().removeDuplicate(arr, 6);

		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			
			System.out.print(itr.next() + " ");
		}
		System.out.println("");
	}
}
