/*
 * 19] Equilibrium Index
 */ 

class Solution {
	
	//Brute Force Approach : 
	int equilibriumIndex(int arr[], int N) {

		for(int i = 0; i < N; i++) {

			int leftSum = 0;
			int rightSum = 0;
			for(int j = 0; j < N; j++) {

				if(j < i) {
					
					leftSum = leftSum + arr[j];
				} else if(j > i) {
				
					rightSum = rightSum + arr[j];
				}
			}
			
			if(leftSum == rightSum) {
					
				return i;
			}
		}
		return -1;
	}

	//Optimize Approach :
	int equilibriumIndex(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			
			arr[i] = arr[i] + arr[i - 1];
		}

		int leftSum = 0, rightSum = 0;
		for(int i = 0; i < arr.length; i++) {
			
			if(i == 0) {
				
				continue;
			} else {
				
				leftSum = arr[i - 1];
			}
			if(arr.length - 1 == 0) {
				
				continue;
			} else {
				
				rightSum = arr[arr.length - 1] - arr[i];
			}
			if(leftSum == rightSum) {
				
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{-7, 1, 5, 2, -4, 3, 0};

		Solution obj = new Solution();
		System.out.println(obj.equilibriumIndex(arr, arr.length));
		System.out.println(obj.equilibriumIndex(arr));
	}
}
