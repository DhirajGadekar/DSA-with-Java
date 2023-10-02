/*
 * 5] Reverse an array without using extra space :
 */ 

class Solution {

	public static void main(String[] args) {
			
		int arr[] = new int[]{1,2,3,4,5};

		int start = 0;
		int end = arr.length - 1;

		while(start < end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}
}
