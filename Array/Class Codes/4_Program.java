/*
 * 4] Reverse Array using extra space :
 */

class Solution {
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,4,5};
		int nums[] = new int[arr.length];

		int itr = arr.length - 1;
		for(int i = 0;i < arr.length; i++) {
			nums[i] = arr[itr];
			itr--;
			System.out.println(nums[i]);
		}
	}
}
