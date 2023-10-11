/*
 * Problem 8
	Given an unsorted array arr[] of size N. Rotate the array to the left (counter-clockwise direction)
	by D steps, where D is a positive integer.

	Example 1:
		Input:
			N = 5, D = 2
			arr[] = {1,2,3,4,5}
		Output: 3 4 5 1 2
		Explanation: 1 2 3 4 5 when rotated
			     by 2 elements, it becomes 3 4 5 1 2.

	Example 2:
		Input:
			N = 10, D = 3
			arr[] = {2,4,6,8,10,12,14,16,18,20}
		Output: 8 10 12 14 16 18 20 2 4 6
		Explanation: 2 4 6 8 10 12 14 16 18 20
			     when rotated by 3 elements, it becomes
			     8 10 12 14 16 18 20 2 4 6.
 */

class Solution {
	
	void rotationArray(int arr[], int N, int D) {
		
		D = D % N;
		for(int i = 0; i < D; i++) {
			
			int temp = arr[0];
			for(int j = 0; j < N - 1; j++) {
				
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp; 
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{2,4,6,8,10,12,14,16,18,20};
		new Solution().rotationArray(arr, arr.length, 3);
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
