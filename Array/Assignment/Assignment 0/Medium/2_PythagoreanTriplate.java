/*
2] Pythagorean Triplet
	Given an array arr of N integers, write a function that returns true if there is a
	triplet (a, b, c) that satisfies a2 + b2 = c2, otherwise false.

	Example 1:
		Input:
			N=5
			Arr[] = {3, 2, 4, 6, 5}
		Output: Yes
		Explanation: a=3, b=4, and c=5 forms a pythagorean triplet.

	Example 2:
		Input:
			N=3
			Arr[] = {3, 8, 5}
		Output: No
		Explanation: No such triplet possible.

	Expected Time Complexity: O(max(Arr[i])2)
	Expected Auxiliary Space: O(max(Arr[i]))

	Constraints:
		1 <= N <= 10^7
		1 <= Arr[i] <= 1000
 */

class Solution {
	
	boolean pythagoreanTriplate(int arr[], int N) {
		
		for(int i = 0; i < N; i++) {
			
			for(int j = i; j < N; j++) {
				
				for(int k = j; k < N; k++) {
					
					if(i*i + j*j == k * k) {

						return true;
					} else if(j*j + k*k == i*i) {

						return true;
					} else if(i*i + k*k == j*j) {

						return true;
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		
		int arr[] = new int[]{3, 2, 4, 6, 5};
		Solution obj = new Solution();
		
		if(obj.pythagoreanTriplate(arr, 5)) {
			
			System.out.println("Yes");
		} else {

			System.out.println("No");
		}
	}
}
