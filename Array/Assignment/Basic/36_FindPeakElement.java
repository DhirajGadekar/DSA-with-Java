/*
36] Find a peak element which is not smaller than its neighbors
	Given an array arr of n elements that is first strictly increasing and then maybe
	strictly decreasing, find the maximum element in the array.
	Note: If the array is increasing then just print the last element will be the maximum
	value.
	Examples:
		Input: array[]= {5, 10, 20, 15}
		Output: 20
		Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

		Input: array[] = {10, 20, 15, 2, 23, 90, 67}
		Output: 20 or 90
		Explanation: The element 20 has neighbors 10 and 15, both of them are less
			     than 20, similarly 90 has neighbors 23 and 67.
 */

class Solution {
    
	int findPeakElement(int[] nums) {
        	
		int peak = -1;
        	for(int i = 1 ; i < nums.length - 1; i++) {
            		
			if(nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {

                		peak = i;
            		}
        	}
       	 	if(peak == -1) {

            		int max = nums[0];
            		peak = 0;
            		for(int i = 0; i < nums.length; i++) {
                		
				if(nums[i] > max) {

                    			max = nums[i];
                    			peak = i;
                		}
            		}
        	}
        	return peak;
    	
	}
}
