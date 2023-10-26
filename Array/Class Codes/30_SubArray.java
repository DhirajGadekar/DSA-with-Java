/*
 * Maximum SubArray:
 * Given an integer array of size N
 * Find the contigious subArray (containing atleast on number) which has the largest sum and return itrs sum 
 *
 * Input : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output : 6
 *
 * A] Brute Force Approach
 */

class Solution {

        public static void main(String[] args) {

                int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
		int max = Integer.MIN_VALUE;
                for(int i = 0; i < arr.length; i++) {
			
			int sum = 0;
                        for(int j = i; j < arr.length; j++) {
				
				sum = sum + arr[j];
                                if(sum > max) {
				
					max = sum;
				}
                        }
                }
		System.out.println(max);
        }
}

