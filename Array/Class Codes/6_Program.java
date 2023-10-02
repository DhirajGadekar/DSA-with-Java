/*
 * 6] 2nd max number in an array :
 */

class Solution {
	
	int secondMax(int arr[], int n) {

		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for(int i = 0; i < n; i++) {

			if(arr[i] > max1) {
				
				max2 = max1;
				max1 = arr[i];
			} else if(arr[i] > max2 && max1 != arr[i]) {
				
				max2 = arr[i];
			}
		}
		return  max2;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,5,4};
		System.out.println(new Solution().secondMax(arr, arr.length));
	}
}
