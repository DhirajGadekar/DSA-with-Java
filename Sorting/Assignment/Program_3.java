/*
 * Problem Statement 3 :
 Given two sorted arrays arr1[] and arr2[] of sizes n and m in non-decreasing order.
 Merge them in sorted order without using any extra space. Modify arr1 so that it
 contains the first N elements and modify arr2 so that it contains the last M elements.

 Example 1:
	Input:
		n = 4, arr1[] = [1 3 5 7]
		m = 5, arr2[] = [0 2 6 8 9]
	Output:
		arr1[] = [0 1 2 3]
		arr2[] = [5 6 7 8 9]
	Explanation: After merging the two non-decreasing arrays, we get,
			0 1 2 3 5 6 7 8 9.
 Example 2:
	Input:
		n = 2, arr1[] = [10 12]
		m = 3, arr2[] = [5 18 20]
	Output:
		arr1[] = [5 10]
		arr2[] = [12 18 20]
	Explanation:
		After merging two sorted arrays we get 5 10 12 18 20.

	Expected Time Complexity: O((n+m) log(n+m))
	Expected Auxiliary Space: O(1)
	
	Constraints:
		1 <= n, m <= 10^5
		0 <= arr1i, arr2i <= 10^7
 */

import java.util.*;
class Solution {
    	
	static long[] mergeArray(long arr1[], long arr2[], int n, int m) {

        	long nums[] = new long[n+m];
        	int itr1 = 0, itr2 = 0, itr3 = 0;
        	while(itr1 < n && itr2 < m) {

            		if(arr1[itr1] < arr2[itr2]) {

                		nums[itr3] = arr1[itr1];
                		itr1++;
            		} else {

                		nums[itr3] = arr2[itr2];
                		itr2++;
            		}
            		itr3++;
        	}
        	while(itr1 < n) {

            		nums[itr3] = arr1[itr1];
            		itr1++;
            		itr3++;
        	}
        	while(itr2 < m) {

            		nums[itr3] = arr2[itr2];
            		itr3++;
            		itr2++;
        	}
        	return nums;
    	}
    	public static void merge(long arr1[], long arr2[], int n, int m) {
        	
		long nums[] = mergeArray(arr1, arr2, n, m);
        	int itr = 0;
        	for(int i = 0; i < n; i++) {

            		arr1[i] = nums[itr];
            		itr++;
        	}
        	for(int i = 0; i < m; i++) {

            		arr2[i] = nums[itr];
            		itr++;
        	}
    	}
	public static void main(String[] args) {
		
		long arr1[] = new long[]{1, 3, 5, 7};
		long arr2[] = new long[]{0, 2, 6, 8, 9};
		merge(arr1, arr2, arr1.length, arr2.length);
		System.out.println("arr1[] = " + Arrays.toString(arr1));
		System.out.println("arr2[] = " + Arrays.toString(arr2));
	}
}

