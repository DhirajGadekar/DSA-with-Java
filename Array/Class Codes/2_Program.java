/*
 * 2] Given an integer array of size N.
 *    COunt the no of element having at least 1 element greater than itself.
 *	
 *	Arr = [2,5,1,4,8,0,8,1,3,8]
 *	N = 10
 *	Output = 7
 */

class Solution {
	
	int bruteForceApproach(int arr[], int N) {
		
		int count = 0;
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(arr[i] < arr[j]) {
					
					count++;
					break;	
				}		
			}
		}
		return count;
	}
	int optimizeApproach(int arr[], int N) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < N; i++) {
			
			if(arr[i] > max) {
				
				max = arr[i];
			}
		}

		int count = 0;
		for(int i = 0; i < N; i++) {
			
			if(max == arr[i]) {
				
				count++;
			}
		}
		return arr.length - count;
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{2,5,1,4,8,0,8,1,3,8};

		Solution obj = new Solution();	
		System.out.println(obj.bruteForceApproach(arr, arr.length));
		System.out.println(obj.optimizeApproach(arr, arr.length));
	}
}
