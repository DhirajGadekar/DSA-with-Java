//Count of SubArrays :

class Solution {
	
	int onofSubarray(int arr[]) {
	
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i; j < arr.length; j++) {
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {

		int arr[] = new int[]{1,2,3,4,5};
		System.out.println(new Solution().onofSubarray(arr));
	}
}
