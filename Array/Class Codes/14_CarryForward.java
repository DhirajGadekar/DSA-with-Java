/*
 * 14] 
 */

class Solution {
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{3, 4, 5, 1, 6, 7, 8, 3, 0};

		int k = 6;
		int max = Integer.MIN_VALUE;
		for(int i = 0; k < arr.length && i <= k; i++) {
	
			if(max < arr[i]) {
				
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
