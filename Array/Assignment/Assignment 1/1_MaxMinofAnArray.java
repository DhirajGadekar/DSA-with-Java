/*
 * 1] Max Min of an Array
 */

class Solution {

	int maxMinSum(int arr[], int n) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < n; i++) {
			
			if(max < arr[i]) {

				max = arr[i];
			}
			if(min > arr[i]) {
				
				min = arr[i];
			}
		}
		return max + min;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{-2, 1, -4, 5, 3};
		System.out.println(new Solution().maxMinSum(arr, arr.length));
	}
}
