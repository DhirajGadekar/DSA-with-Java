/*
 * Problem Statement 12:
 * Given an array arr[] of size N, check if it is sorted in non-decreasing order or not.
 * Use quick sort
 */

class Solution {
    	
	boolean arraySortedOrNot(int[] arr, int n) {

        	for(int i = 0; i < n - 1; i++) {

            		if(arr[i] <= arr[i + 1]) {

                		continue;
            		} else {

                		return false;
            		}
        	}
        	return  true;
    	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{10, 20, 30, 40, 50};
			
		if(new Solution().arraySortedOrNot(arr, arr.length)) {
			
			System.out.println(1);
		} else {
			
			System.out.println(2);
		}
	}
}
