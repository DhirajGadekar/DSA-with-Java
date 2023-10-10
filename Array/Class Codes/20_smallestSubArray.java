/*
 * 20]  Given an integer array of size N.
 * 	return the length of the smallest subArray when contains both the maximum of 
 * 	array of the minimum of array.
 *
 * 	Arr: [1,2,3,1,2,3,4,6,4,6,3]
 */

class Solution {
	
	int shortestSubArray(int arr[], int N) {
		
		int maxValue = Integer.MIN_VALUE;
		int minValue = Integer.MAX_VALUE;

		for(int i = 0; i < N; i++) {
			
			if(maxValue < arr[i]) {
			
				maxValue = arr[i];
			}
			if(minValue > arr[i]) {
	
				minValue = arr[i];			
			}
		}
		if(maxValue == minValue) {
			
			return 1;
		}
		int minLength = Integer.MAX_VALUE;
		int length = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			
			for(int j = i; j < N; j++) {
				
				if(arr[i] == maxValue && arr[j] == minValue) {
					
					length = j - i + 1;
				}
				if(arr[j] == maxValue && arr[i] == minValue) {
					
					length = j - i + 1;
				}

				if(length < minLength) {
					
					minLength = length;
				}
			}
		}
		return minLength;
	}

	int shortestSubArray(int arr[], int N) {
		
		for(int i = 0; i < arr.length; i++) {
			

		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 2, 3, 4, 5, 5, 5, 3, 2};
		System.out.println(new Solution().shortestSubArray(arr, arr.length));
	}
}	
