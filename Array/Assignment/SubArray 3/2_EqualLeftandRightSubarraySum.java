/*
 * 2] Equal Left and Right Subarray Sum
 */

class Solution{
	int equalSum(int [] A, int N) {
		for(int i = 1; i < N; i++) {

		    A[i] = A[i] + A[i - 1];
		}
		int leftSum = 0;
		int rightSum = 0;
		for(int i = 0; i < N; i++) {

		    if(i == 0) {

		        leftSum = 0;
		        rightSum = A[N-1] - A[i];
		    } else if(i == N - 1) {

		        rightSum = 0;
		        leftSum = A[i - 1];
		    } else {

		        leftSum = A[i - 1];
		        rightSum = A[N - 1] - A[i];
		    }
		    if(leftSum == rightSum) {

		        return  i + 1;
		    }
		}
		return -1;
	}
}
