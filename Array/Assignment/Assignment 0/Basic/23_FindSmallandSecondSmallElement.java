/*
 23] Find the smallest and second smallest element in an array
	Given an array of integers, your task is to find the smallest and second smallest
	element in the array. If smallest and second smallest do not exist, print -1.

	Example 1:
		Input :
			5
			2 4 3 5 6
		Output :
			2 3
		Explanation:
			2 and 3 are respectively the smallest
			and second smallest elements in the array.

	Example 2:
		Input :
			6
			1 2 1 3 6 7
		Output :
			12
		Explanation:
			1 and 2 are respectively the smallest
			and second smallest elements in the array.
	
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	
	Constraints:
		1<=N<=10^5
		1<=A[i]<=10^5
 */

class Solution {
	
	int[] minAnd2ndMin(int a[], int n) {
        
        	int arr[] = new int[]{-1, -1};
        	int min1 = Integer.MAX_VALUE;
        	int min2 = Integer.MAX_VALUE;
        
        	for(int i = 0; i < n; i++) {
            
            		if(min1 > a[i]) {
               
               	 		min2 = min1;
                		min1 = a[i];
            		} else if(min2 > a[i] && a[i] != min1) {
                
                		min2 = a[i];
            		}     
        	}
        	if(a.length < 2) {
            
            		return arr;
        	} else if(min2 == Long.MAX_VALUE) {
            
            		arr[0] = -1;
            		arr[1] = -1; 
            		return arr;
        	}
        	arr[0] = min1;
        	arr[1] = min2;
        	return arr;
    	}
}
