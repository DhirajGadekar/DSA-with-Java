/*
 * 8]
 */

import java.util.*;

class Solution {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int start = sc.nextInt();
		int end = sc.nextInt();

		int arr[] = new int[]{2, 5, 3, 11, 7, 3};
		int sum = 0;
		if((start >= 0 && start < arr.length) &&(end < arr.length && end >= 0)) {
			for(int i = start; i <= end; i++) {
			
				sum = sum + arr[i];
			}
		}
		System.out.println(sum);
	}
}
