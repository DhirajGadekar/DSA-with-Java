/*
 * 16] Given an integer array of size N.
 * 	Build an array RightMax of size N
 * 	
 * 	Arr = [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
 * 	N = 10
 */

class Solution {
	
	int[] rightMax(int arr[], int N) {
		
		int rightMax[] = new int[N];
		rightMax[N-1] = arr[N-1];
		for(int i = N - 2; i >= 0; i--) {
			
			if(rightMax[i + 1] < arr[i]) {
				
				rightMax[i] = arr[i];
			} else {

				rightMax[i] = rightMax[i + 1];
			}
		}
		return rightMax;
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
		int rightMax[] = obj.rightMax(arr, arr.length);
		obj.printArray(arr);
		obj.printArray(rightMax);
	}
}

