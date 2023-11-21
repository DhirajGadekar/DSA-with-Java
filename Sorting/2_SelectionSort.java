/*
 * 2] Selection Sort :
 */

import java.util.*;
class SelectionSort {
	
	void sorting(int arr[]) {

		for(int i = 0; i < arr.length; i++) {
			
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[minIndex] > arr[j]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{4,5,3,8,1,9,2,6,7};
	
		new SelectionSort().sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
}
