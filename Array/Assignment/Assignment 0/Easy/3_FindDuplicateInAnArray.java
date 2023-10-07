/*
Que 3 : Find Duplicates in an Array
	
	Given an array of size N which contains elements from 0 to N-1, you need to find all the
	elements occurring more than once in the given array. Return the answer in ascending
	order. If no such element is found, return list containing [-1].
	
	Note: The extra space is only for the array to be returned. Try and perform all operations
	      within the provided array.

	Example 1:
		Input:
			N=4
			a[] = {0,3,1,2}
		Output:
			-1
		Explanation:
			There is no repeating element in the array. Therefore output is -1.
	Example 2:
		Input:
			N=5
			a[] = {2,3,1,2,3}
		Output:
			23
		Explanation:
			2 and 3 occur more than once in the given array.
	
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)

	Constraints:
		1 <= N <= 10^5
		0 <= A[i] <= N-1, for each valid i
 */

import java.util.*;

class Solution {
	ArrayList<Integer> duplicates(int arr[], int n) {
        
        	Set<Integer> al = new TreeSet<Integer>();
        	Set<Integer> s = new HashSet<Integer>();
        
        	for(int i = 0; i < n; i++) {
            
            		if(!s.add(arr[i])) {
                
                		if(!al.contains(arr[i])) {
                    
                    			al.add(arr[i]);
                		}
            		}
        	}
        	
		if(s.size() == n) {
            
            		al.add(-1);
            		return new ArrayList(al);
        	} else {
            
            		return new ArrayList(al);
        	}
    	}
}
