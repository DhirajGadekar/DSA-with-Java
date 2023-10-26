/*
 * Maximum SubArray:
 * Given an integer array of size N
 * Find the contigious subArray (containing atleast on number) which has the largest sum 
 *
 * Input : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
 * Output : 4 -1 2 1
 *
 */

class Solution {

        public static void main(String[] args) {

                int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
                int max = Integer.MIN_VALUE;
                int sum = 0;
		int start = 0;
		int end = 0;
		int x = 0;
                for(int i = 0; i < arr.length; i++) {

			if(sum == 0) {
				
				x = i;
			}
                        sum = sum + arr[i];
                        if(sum > max) {
                                max = sum;
				start = x;
				end = i;
                        }
                        if(sum < 0 ) {
				//start = i + 1;
                                sum = 0;
                        }
                }
                for(int i = start; i <= end; i++) {
			
			System.out.println(arr[i]);
		}
        }
}

