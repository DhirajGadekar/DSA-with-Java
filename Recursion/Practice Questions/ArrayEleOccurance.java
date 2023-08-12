class Solution {
	
	int elementOccur(int arr[], int target) {
		
		return countElement(arr, target, 0,0);
	}
	int countElement(int arr[], int target, int count, int index) {
		
		if(arr.length == index) {
			
			return count;
		}
		if(arr[index] == target) {
			
			count++;
		}
		return countElement(arr, target, count, ++index);
	}
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int arr[] = new int[]{1,2,3,4,2,3,5,4,7,2,3};
		System.out.println(s.elementOccur(arr, 10));

	}
}
