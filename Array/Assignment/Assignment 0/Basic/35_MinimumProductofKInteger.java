/*
35] Minimum Product of k Integers
	Given an array of N positive integers. You need to write a program to print the
	minimum product of k integers of the given array.
	Note: Since output could be large, hence module 10^9+7 and then print answer.

	Example 1:
		Input : Arr[] = {1, 2, 3, 4, 5}, K = 2
		Output : 2
		Explanation:
			If we have an array [1, 2, 3, 4, 5]. We will get the minimum product after
			multiplying 1 and 2 that is 2.
			So, the answer is 2.

	Example 2:
		Input : Arr[] = {9, 10, 8}, K = 3
		Output : 720

	Expected Time Complexity: O(nlogn).
	Expected Auxiliary Space: O(1).

	Constraints:
		1 ≤ K, N ≤ 10^5
 */

import java.util.*;

class Solution{

    	int minProduct(int arr[], int n,int k) {

        	Arrays.sort(arr);

        	int mul = 1;
        	for(int i = 0; i < k; i++) {

            		mul = (mul * arr[i]) % 1000000007;

        	}
        	return (int)mul;
    }
}
