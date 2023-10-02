/*
 * 3] Addition of pairs in array;
 */

class Solution {
	
	int countPairs(int arr[], int n, int sum) {
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			
			for(int j = i + 1; j < n; j++) {

				if(arr[i] + arr[j] == sum) {

					count++;
				}
			}
		}
		return count * 2;
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		
		int arr[] = new int[]{3,5,2,1,-3,7,8,15,6,13};

		System.out.println(obj.countPairs(arr, 10, 10));
	}
}
