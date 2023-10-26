/*
 * Maximum SubArray:
 * Given an integer array of size N
 * Find the contigious subArray (containing atleast on number) which has the largest sum and return itrs sum 
 *
 * Input : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output : 6
 *
 * B] Kedane's Algorithm :
 */

class Solution {

        public static void main(String[] args) {

                int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
                int max = Integer.MIN_VALUE;
		int sum = 0;
                for(int i = 0; i < arr.length; i++) {
			
			sum = sum + arr[i];
			if(sum > max) {
				max = sum;
			}
			if(sum < 0 ) {
				
				sum = 0;
			}
		}       
                System.out.println(max);
        }
}
