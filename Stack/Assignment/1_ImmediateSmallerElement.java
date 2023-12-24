/*
 * Problem 1. Immediate Smaller Element
 */

class Solution {
	void immediateSmaller(int arr[], int n) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {

                		arr[i] = arr[i + 1];
            		} else {

                		arr[i] = -1;
            		}
       		}
       		arr[arr.length - 1] = -1;
    	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{5, 6, 2, 3, 1, 7};
		Solution s = new Solution();
		s.immediateSmaller(arr, arr.length);

		for(int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
