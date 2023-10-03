/*
 * 13] Array Rotation 
 * 	
 *     Problem Description :
 *     - Given an integer array A of size N and an integer B
 *       You have to return save area after rotating times towards the right
 *
 *     Problem Constraints :
 *	1 <= N <= 10^5
 *	1 <= A[i] <= 10^9
 *	1 <= B <= 10^9
 */

class Solution {
	
	/*
	 * Time Complexity : O(N)
	 * Space Complexity : O(N)
	 */
	int[] arrayRotationFirstA(int arr[], int B) {
		
		int nums[] = new int[arr.length];
		int itr = 0;
		for(int i = B; i < arr.length; i++) {
			
			nums[itr] = arr[i];
			itr++;
		}
		itr = B;
		for(int i = 0;i < B; i++) {
			
			nums[itr] = arr[i];
			itr++;
		}
		return nums;
	}

	/*
	 * Time Complexity : O(B*N)
	 * Space Complexity : O(1)
	 */
	int[] arrayRotationSecondA(int arr[], int B) {
		
		for(int i = 0; i < B; i++) {
			
			int temp = arr[0];
			for(int j = 0; j < arr.length - 1; j++) {
				
				arr[j] = arr[j + 1];
			}
			arr[arr.length - 1] = temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		
		int arr1[] = new int[]{1,2,3,4};
		int arr2[] = new int[]{1,2,3,4,5,6};

		Solution obj = new Solution();
		arr1 = obj.arrayRotationFirstA(arr1, 2);
		arr2 = obj.arrayRotationSecondA(arr2, 3);

		
		System.out.println("First Approach : ");
		for(int i = 0; i < arr1.length; i++) {
			
			System.out.print(arr1[i] + " ");
		}
		System.out.println();

		System.out.println("Second Approach : ");
		for(int i = 0; i < arr2.length; i++) {
			
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
	}
}

