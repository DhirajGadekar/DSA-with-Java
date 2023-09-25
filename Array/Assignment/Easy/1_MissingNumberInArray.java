/*
Que 1 : Missing number in array
	Given an array of size N-1 such that it only contains distinct integers in the range of 1 to
	N. Find the missing element.
	
	Example 1:
		Input:
			N=6
			A[] = {1,2,4,5,6}
		Output: 3
	
	Example 2:
		Input:
			N = 11
			A[] = {1,3,2,5,6,7,8,11,10,4}
		Output: 9

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)

	Constraints:
		1 ≤ N ≤ 106
		1 ≤ A[i] ≤ 106
*/

class Solution {
	int missingNumber(int array[], int n) {

        	Arrays.sort(array);
        	int itr = 1;
       
	       	for(int i = 0; i < n - 1;i++) {
            
           	 	if(itr != array[i]) {
                
                		return itr;
            		}
            		itr++;
        	}
        	return n;
    	}
}

