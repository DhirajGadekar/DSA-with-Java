/*
 12] First and last occurrences of X
	Given a sorted array having N elements, find the indices of the first and last
	occurrences of an element X in the given array.
	Note: If the number X is not found in the array, return '-1' as an array.
	Example 1:
		Input:
			N=4,X=3
			arr[] = { 1, 3, 3, 4 }
		Output:
			12
		Explanation:
			For the above array, first occurance of X = 3 is at index = 1 and last
			occurrence is at index = 2.
	Example 2:
		Input:
			N = 4, X = 5
			arr[] = { 1, 2, 3, 4 }
		Output:
			-1
		Explanation:
			As 5 is not present in the array, so the answer is -1.
	Expected Time Complexity: O(log(N))
	Expected Auxiliary Space: O(1)
	Constraints:
		1 <= N <= 10^50 <= arr[i], X <= 10^9
 */

class Solution {
    	
	int[] searchRange(int[] nums, int target) {
        	int arr[] = new int[]{-1,-1};

        	int count = 0;
        	int first = -1;
        	int last = -1;
        	for(int i = 0; i < nums.length; i++) {

            		if(target == nums[i]) {

                		count++;
                		if(count == 1) {

                    			first = i;
                		} else {	

                    			last = i;
                		}
            		}

        	}
        	
		if(first != -1 && last != -1) {

           	 	arr[0] = first;
            		arr[1] = last;
        	} else if(first != -1 && last == -1) {

            		arr[0] = first;
            		arr[1] = first;
        	}
        	return arr;
    	}
}
