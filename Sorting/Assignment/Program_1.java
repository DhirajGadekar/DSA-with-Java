/*
Problem Statement 1:
	Given an Integer N and a list arr. Sort the array using bubble sort algorithm.
	Example 1:
		Input:
			N = 5
			arr[] = {4, 1, 3, 9, 7}
		Output:
			1 3 4 7 9
	Example 2:
		Input:
			N = 10
			arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
		Output:
			1 2 3 4 5 6 7 8 9 10
	Expected Time Complexity: O(N^2).
	Expected Auxiliary Space: O(1).
	Constraints:
		1 <= N <= 10^3
		1 <= arr[i] <= 10^3
 */

import java.util.*;
class BubbleSort {
	
	void sorting(int N, int arr[]) {
	
		for(int i = 0; i < N - 1; i++) {

			for(int j = 0; j < N - i - 1; j++) {
				
				if(arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{4, 1, 3, 9, 7};
		new BubbleSort().sorting(arr.length, arr);
		System.out.println(Arrays.toString(arr));
	}
}
