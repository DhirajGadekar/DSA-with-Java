/*
 * Example 9
	Given a sorted array arr containing n elements with possibly some duplicate, the task is to find
	the first and last occurrences of an element x in the given array.
	Note: If the number x is not found in the array then return both the indices as -1.

	Example 1:
		Input:
			n=9, x=5
			arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 }
		Output:
			2 5
		Explanation:
			First occurrence of 5 is at index 2 and last occurrence of 5 is at index 5.
	Example 2:
		Input:
			n=9, x=7
			arr[] = { 1, 3, 5, 5, 5, 5, 7, 123, 125 }
		Output:
			6 6
		Explanation:
			First and last occurrence of 7 is at index 6.
 */

class Solution {
	
	int[] firstLastOccur(int arr[], int x) {
		
		int num[] = new int[2];

		int first = 0, last = arr.length - 1;
		while(first < last) {
			
			if(arr[first] != x) {
				
				first++;
			}
			if(arr[last] != x) {
				
				last--;
			}
			if(arr[first] == arr[last]) {
				
				num[0] = first;
				num[1] = last;
				return num;
			}
		}
		if(arr[first] == x && arr[first] != x) {
			
			num[0] = first;
			num[1] = last;
		}
		if(arr[last] == x && arr[first] != x) {
			num[0] = last;
			num[1] = last;
		}
		return num;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{1, 3, 5, 5, 5, 5, 7, 123, 125};
		int num[] = new Solution().firstLastOccur(arr, 7);
		System.out.println(num[0] + " " + num[1]);
	}
}
