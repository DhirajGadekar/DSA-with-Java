/*
6] Elements in the Range
	Given an array arr[] containing positive elements. A and B are two numbers
	defining a range. The task is to check if the array contains all elements in the given
	range.

	Example 1:
		Input: N = 7, A = 2, B = 5
			arr[] = {1, 4, 5, 2, 7, 8, 3}
		Output: Yes
		Explanation: It has elements between range 2-5 i.e 2,3,4,5
	
	Example 2:
		Input: N = 7, A = 2, B = 6
			arr[] = {1, 4, 5, 2, 7, 8, 3}
		Output: No
		Explanation: Array does not contain 6.
	
	Note: If the array contains all elements in the given range then driver code outputs
		Yes otherwise, it outputs No

	Expected Time Complexity: O(N).
	Expected Auxiliary Space: O(1).
	Constraints:
		1 ≤ N ≤ 10^7
 */

class Solution {

	boolean elementsInRange(int arr[], int A, int B) {
	
		int flag = 0;
		for(int i = A; i <= B; i++) {
			
			for(int j = 0; j < arr.length; j++) {
				
				if(i == arr[j]) {
					
					flag = 1;
					break;
				} else {
				
					flag = 0;
				}
			}
			if(flag == 0) {
				
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		
		Solution s = new Solution();

		int arr[] = new int[]{1,2,5,3,7,4,6,8,10};
		boolean ret = s.elementsInRange(arr, 2, 6);
		if(ret) {
			
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}
	}
}
