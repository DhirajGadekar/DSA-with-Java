/*
Que 16 : Rotation
	Given an ascending sorted rotated array Arr of distinct integers of size N. The array is
	right rotated K times. Find the value of K.

	Example 1:
		Input:
			N=5
			Arr[] = {5, 1, 2, 3, 4}
		Output: 1
		Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5.
			     We can see that the array was rotated 1 time to the right.

	Example 2:
		Input:
			N=5
			Arr[] = {1, 2, 3, 4, 5}
		Output: 0
		Explanation: The given array is not rotated.

	Expected Time Complexity: O(log(N))
	Expected Auxiliary Space: O(1)

	Constraints:
		1 <= N <=105
		1 <= Arri <= 107
 */

class Solution {
    	
	int findKRotation(int arr[], int n) {

        	if(arr[0]  < arr[arr.length - 1]) {

            		return 0;
        	}
        	if(arr.length == 1) {

            		return 0;
        	}
        	int count = 1;
        	for(int i = 1; i < n - 1; i++) {

            		if(arr[i - 1] > arr[i] && arr[i] <= arr[i + 1]) {

                		return count;
            		} else {

                		count++;
            		}
        	}
        	return count;
    	}
}
