/*
 * 2] Linear Search - Multiple Occurences
 */

class Solution {
	
	int linearSearch(int arr[], int target) {
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
			
		int arr[] = new int[]{1,2,2};
		System.out.println(new Solution().linearSearch(arr, 2));
	}
}
