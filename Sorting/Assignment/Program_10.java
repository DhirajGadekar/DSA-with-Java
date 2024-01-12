/*
 * Problem Statement 10 :
 * Given an array nums, return true if the array was originally sorted in
non-decreasing order, then rotated some number of positions (including zero).
Otherwise, return false.
There may be duplicates in the original array.
Note: An array A rotated by x positions results in an array B of the same length
such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

Example 1:
Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.

You can rotate the array by x = 3 positions to begin on the element of value 3:
[3,4,5,1,2].
Example 2:
Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:
Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

class Solution {
	boolean check(int[] nums) {
        	int x = 0;
        	if(nums[0] >= nums[nums.length - 1]) {

            		for(int i = 0; i < nums.length - 1; i++) {

                		if(nums[i] > nums[i + 1]) {

                    			x = i + 1;
                    			break;	
                		}
            		}
        	}
        //System.out.println(x);
        	if(x == 0) {

            		for(int i = 0; i < nums.length - 1; i++) {

                		if(nums[i] > nums[i + 1]) {

                    			return false;
                		}
            		}
        	} else {

            		for(int i = 0; i < x - 1; i++) {

                		if(nums[i] > nums[i + 1]) {

                    			return false;
                		}
            		}
            		for(int i = x; i < nums.length - 1; i++) {

               	 		if(nums[i] > nums[i + 1]) {

                    			return false;
                		}
            		}
        	}
        	return true;
    	}
	public static void main(String[] args) {
	
		int arr[] = new int[]{3,4,5,1,2};
		System.out.println(new Solution().check(arr));
	}
}
