/*
 * 22] Shortest SubArray
 */

class Solution {
	
	int shortestSubArray(int arr[], int N) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
			
			if(max < arr[i]) {
				
				max = arr[i];
			}
			if(min > arr[i]) {
			
				min = arr[i];
			}
		}
		int left = 0;
		int right = 0;
		int length = 0;
		int minLength = Integer.MAX_VALUE;
		for(int i = 0; i < N; i++) {
		
			if(min == arr[i]) {
				
				left = i;
			}
			if(max == arr[i]) {
				
				right = i;
			}
			if((arr[left] == min && arr[right] == max) || (arr[left] == max && arr[right] == min)) {
				
				if(right > left) {
					
					length = right - left + 1;
				} else {

					length = left - right + 1;
				}
				if(length < minLength) {
				
					minLength = length;
				}
			}
		}
		return minLength;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{6,2,3,3,1,1,6,3,2,6};
		System.out.println(new Solution().shortestSubArray(arr, arr.length));
	}
}
