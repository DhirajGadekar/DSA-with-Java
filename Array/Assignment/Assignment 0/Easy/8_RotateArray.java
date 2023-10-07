/*
Que 8 : Rotate Array
	Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise
	direction) by D steps, where D is a positive integer.

	Example 1:
		Input:
			N = 5, D = 2
			arr[] = {1,2,3,4,5}
		Output: 3 4 5 1 2
		Explanation: 1 2 3 4 5 when rotated by 2 elements, it becomes 3 4 5 1 2.

	Example 2:
		Input:
			N = 10, D = 3
			arr[] = {2,4,6,8,10,12,14,16,18,20}
		Output: 8 10 12 14 16 18 20 2 4 6
		Explanation: 2 4 6 8 10 12 14 16 18 20 when rotated by 3 elements, it becomes 8 10 12 14 16 18 20 2 4 6.
	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	Constraints:
		1 <= N <= 10^6
		1 <= D <= 10^6
		0 <= arr[i] <= 10^5
 */

class Solution {
   
    	void rotate(int arr[], int d) {

        	if(d == 0) {

            		return;
        	}
        	int temp = arr[0];
        	for(int i = 0; i < arr.length - 1; i++) {

            		arr[i] = arr[i + 1];
        	}
        	arr[arr.length - 1] = temp;
        	rotate(arr, --d);
    	}
    	void rotateArr(int arr[], int d, int n) {
        
		new Solution().rotate(arr, d);
    	}
}
