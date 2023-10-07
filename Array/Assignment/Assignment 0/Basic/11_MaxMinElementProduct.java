/*
 11] Product of maximum in first array and minimum in second
	Given two arrays of A and B respectively of sizes N1 and N2, the task is to
	calculate the product of the maximum element of the first array and minimum
	element of the second array.

	Example 1:
		Input : A[] = {5, 7, 9, 3, 6, 2},
			B[] = {1, 2, 6, -1, 0, 9}
		Output : -9
		Explanation:
			The first array is 5 7 9 3 6 2.
			The max element among these elements is 9.
			The second array is 1 2 6 -1 0 9.
			The min element among these elements is -1.
			The product of 9 and -1 is 9*-1=-9.
	
	Example 2:
		Input : A[] = {0, 0, 0, 0},
			B[] = {1, -1, 2}
		Output : 0
		Expected Time Complexity: O(N + M).
		Expected Auxiliary Space: O(1).
	Output:
		For each test case, output the product of the max element of the first array and the
		minimum element of the second array.
	
	Constraints:
		1 ≤ N, M ≤ 10^6
 */

class Solution {

	long find_multiplication (int arr[], int brr[], int n, int m) {
        
        	int max = arr[0];
        	int min = brr[0];
        
		// Find Max number in arr
        	for(int i = 0; i < n; i++) {
                
           	 	if(max < arr[i]) {
                
                		max = arr[i];
            		}
        	}
        
		//Find min number brr 
        	for(int i = 0; i < m; i++) {
                
            		if(min > brr[i]) {
                
                		min = brr[i];
            		}    
        	}
        	return (max * min);
    	} 
}
