/*
 * 10] Prefix Sum :  
 */

import java.util.*;
class Solution {
	
	public static void main(String[] args) {
		
		int N = 10;
		int arr[] = new int[]{-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

		int psArr[] = new int[N];

		psArr[0] = arr[0];

		for(int i = 1; i < N; i++) {
			
			psArr[i] = psArr[i - 1] + arr[i];
		}

		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++) {
			
			int s = sc.nextInt();
			int e = sc.nextInt();

			int sum = psArr[e] - psArr[s - 1];
			System.out.println(sum);
		}
	}
}
