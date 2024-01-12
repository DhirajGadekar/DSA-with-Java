/*
 * Problem Statement 9 :
   You are given a 0-indexed integer array nums and a target element target.
   A target index is an index i such that nums[i] == target.
   Return a list of the target indices of nums after sorting nums in non-decreasing
   order. If there are no target indices, return an empty list. The returned list must be
   sorted in increasing order.

 * Example 1:
	Input: nums = [1,2,5,2,3], target = 2
	Output: [1,2]
	Explanation: After sorting, nums is [1,2,2,3,5].
		     The indices where nums[i] == 2 are 1 and 2.

 * Example 2:
	Input: nums = [1,2,5,2,3], target = 3
	Output: [3]
	Explanation: After sorting, nums is [1,2,2,3,5].
		     The index where nums[i] == 3 is 3.
 * Example 3:
	Input: nums = [1,2,5,2,3], target = 5
	Output: [4]
	Explanation: After sorting, nums is [1,2,2,3,5].
		     The index where nums[i] == 5 is 4.

 * Constraints:
	1 <= nums.length <= 100
	1 <= nums[i], target <= 100
*/

import java.util.*;
class Solution {
	void merge(int arr[], int start, int mid, int end) {

                int n1 = mid - start + 1;
                int n2 = end - mid;

                int nums1[] = new int[n1];
                int nums2[] = new int[n2];
                for(int i = 0; i < n1; i++) {

                        nums1[i] = arr[start + i];
                }
                for(int i = 0; i < n2; i++) {

                        nums2[i] = arr[mid + i + 1];
                }
                int itr1 = 0, itr2 = 0, itr3 = start;
                while(itr1 < nums1.length && itr2 < nums2.length) {

                        if(nums1[itr1] < nums2[itr2]) {

                                arr[itr3] = nums1[itr1];
                                itr1++;
                        } else {

                                arr[itr3] = nums2[itr2];
                                itr2++;
                        }
                        itr3++;
                }
                while(itr1 < nums1.length) {

                        arr[itr3] = nums1[itr1];
                        itr1++;
                        itr3++;
                }
                while(itr2 < nums2.length) {

                        arr[itr3] = nums2[itr2];
                        itr2++;
                        itr3++;
                }
        }
        void mergesort(int arr[], int start, int end) {
                if(start < end) {

                        int mid = (start + end) / 2;
                        mergesort(arr, start, mid);
                        mergesort(arr, mid + 1, end);
                        merge(arr, start, mid, end);
                }
        }

    	public List<Integer> targetIndices(int[] nums, int target) {
        
        	mergesort(nums, 0, nums.length - 1);
       	 	List<Integer> al = new ArrayList<Integer>();
       	 	for(int i = 0; i < nums.length; i++) {

            		if(nums[i] == target) {

                		al.add(i);
            		}
        	}
        	return al;
    	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,5,2,3};
		System.out.println(new Solution().targetIndices(arr, 2));
	}
}
