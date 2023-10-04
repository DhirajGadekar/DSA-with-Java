/*
 * 15] Given an integer array of size N.
 * 	Build an array leftMax of size N
 * 	leftmax of i contains the maximum for the index 0 to the index i
 *
 * 	Arr = [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
 * 	N = 10
 */

class Solution {
	
	int[] leftMaxBruteForce(int arr[], int N) {
		
		int leftMax[] = new int[N];
		for(int i = 0; i < N; i++) {
			
			int max = Integer.MIN_VALUE;
			for(int j = 0; i <= j; i++) {
			
				if(arr[i] > max) {
					
					max = arr[i];
				}
			}
			leftMax[i] = max;
		}
		return leftMax;
	}
	int[] leftMaxOptimize(int arr[], int N) {
		
		int leftMax[] = new int[N];
		leftMax[0] = arr[0];
		for(int i = 1; i < N; i++) {
			
			if(leftMax[i - 1] < arr[i]) {
				
				leftMax[i] = arr[i];
			} else {

				leftMax[i] = leftMax[i - 1];
			}
		}
		return leftMax;
	}

	void printArray(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
		int leftMax1[] = obj.leftMaxOptimize(arr, arr.length);
		int leftMax2[] = obj.leftMaxOptimize(arr, arr.length);
		obj.printArray(arr);
		obj.printArray(leftMax1);
		obj.printArray(leftMax2);
	}
}

