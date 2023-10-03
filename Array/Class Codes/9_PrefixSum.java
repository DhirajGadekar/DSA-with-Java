/*
 * 9] Given an array of size N and Q number of queries. Query contains tow paramerter (s, e).
 *    s => start index and index Query for all queries print the sum of all elements from 
 *    index s to e index.
 *
 *    Arr = [-3, 6, 2, 4, 5, 2, 8, 9, 1]
 *    N = 10
 *    Q = 3
 */

import java.util.*;

class Solution {
	
	void rangeSum(int arr[], int N, int Q) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < Q; i++) {
			
			int start = sc.nextInt();
			int end = sc.nextInt();
			int sum = 0;
                	//if((start >= 0 && start < arr.length) &&(end < arr.length && end >= 0)) {
                        	for(int j = start; j <= end; j++) {

                                	sum = sum + arr[j];
                        	}
                	//}
                	System.out.println(sum);
		}
	}	
	public static void main(String[] args) {
		
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3,1};
		int Q = 3;
		new Solution().rangeSum(arr, arr.length, Q);
	}	
}

/*
 * T.C = O(Q * N)
 * S.C = O(1)
 */
