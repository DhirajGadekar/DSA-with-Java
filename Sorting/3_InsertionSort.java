/*
 * 3] Insertion Sort :
 */

import java.util.*;
class InsertionSort {
	
	void sorting(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			
			int val = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > val) {
				
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}
	public static void main(String[] args) {
		int arr[] = new int[]{2,9,3,1,6,8,4,5,7};
		new InsertionSort().sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
}
