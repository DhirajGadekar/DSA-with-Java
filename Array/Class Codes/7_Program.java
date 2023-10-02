/*
 * 7]
 */

class Solution {
	
	public static void main(String[] args) {

		int arr[] = new int[]{1,2,3,4,5,6};

		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			
			if(start == end) {
				
				System.out.println(arr[start]);
			} else {
				
				System.out.println(arr[start] + arr[end]);
			}
			start++;
			end--;
		}
	}
}
