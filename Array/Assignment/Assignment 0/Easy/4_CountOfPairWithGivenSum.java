/*
Que 4 : Count pairs with given sum
	
	Given an array of N integers, and an integer K, find the number of pairs of elements in
	the array whose sum is equal to K.
	
	Example 1:
		Input:
			N = 4, K = 6
			arr[] = {1, 5, 7, 1}
		Output: 2
		Explanation:
			arr[0] + arr[1] = 1 + 5 = 6
			and arr[1] + arr[3] = 5 + 1 = 6.
	Example 2:
		Input:
			N = 4, K = 2
			arr[] = {1, 1, 1, 1}
		Output: 6
		Explanation:
			Each 1 will produce sum 2 with any 1.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(N)

	Constraints:
		1 <= N <= 10^5
		1 <= K <= 10^8
		1 <= Arr[i] <= 10^6
 */

class Solution {

	int getPairCount(int arr[], int n, int sum) {
		
		int count = 0;
        	for(int i = 0; i < n; i++) {
            
            		for(int j = i + 1; j < n; j++) {
                
                		if(arr[i] + arr[j] == sum) {
                    			
					count++;
                		}
            		}
		}
		return count;
	}
}
