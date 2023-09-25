/*
 9] Remove an Element at Specific Index from an Array
	Given an array of a fixed length. The task is to remove an element at a specific
	index from the array.
	
	Examples 1:
		Input: arr[] = { 1, 2, 3, 4, 5 }, index = 2
		Output: arr[] = { 1, 2, 4, 5 }
	Examples 2:
		Input: arr[] = { 4, 5, 9, 8, 1 }, index = 3
		Output: arr[] = { 4, 5, 9, 1 }
 */

class Solution {
	
	int[] removeElement(int arr[], int index) {
		
		int num[] = new int[arr.length - 1];
		int itr = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			
			if(i < index) {
				
				num[itr] = arr[i];
			} else {
				
				num[itr] = arr[i + 1];
			}
			itr++;
		}
		return num;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,4,5,6,7};
		int num[] = new Solution().removeElement(arr, 6);
		for(int i = 0; i < num.length; i++) {
			
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
}
