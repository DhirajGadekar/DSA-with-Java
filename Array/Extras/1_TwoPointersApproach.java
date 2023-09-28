/*
 * Sort given array considering of only 0s and 1s :
 */

class Solution {
	
	void optimizeApproach(int arr[], int n) {
		
		int left = 0, right = n - 1;
		while(left < right) {
			
			if(arr[left] == 1 && arr[right] == 0) {
				
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
			if(arr[left] == 0) {
			
				left++;
			}
			if(arr[right] == 1) {
				
				right--;
			}
		}
	}
	void bruteForceApproach(int arr[], int n) {
		
		int zeroCount = 0;
		for(int i = 0; i < n; i++) {
			
			if(arr[i] == 0) {
				
				zeroCount++;
			}
		}
		for(int i = 0; i < n; i++) {
			if(i < zeroCount) {
				
				arr[i] = 0;
			} else {
				
				arr[i] = 1;
			}
		}
	}
	void printArray(int arr[], int n) {
		
		for(int i = 0; i < n; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 0, 0, 1, 1, 0, 1, 1, 0};
		Solution obj = new Solution();
		
		//obj.bruteForceApproach(arr, 8);
		obj.optimizeApproach(arr, 9);
		obj.printArray(arr, 9);

		
	}
}
