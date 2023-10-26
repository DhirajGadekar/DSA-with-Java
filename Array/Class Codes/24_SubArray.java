// print subArray from start to end: 

class Solution {
	
	void printSubArray(int arr[], int start, int end) {
		
		for(int i = start; i <= end; i++) {
			
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
		new Solution().printSubArray(arr, 2, 6);
	}
}
