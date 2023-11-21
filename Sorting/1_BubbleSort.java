/*
 * 1] Bubble Sort
 */

import java.util.*;
class BubbleSort {
	
	void sorting(int arr[]) {
		
		for(int i = 0;i < arr.length - 1; i++) {
			
			for(int j = 0; j < arr.length - i - 1; j++) {
				
				if(arr[j] > arr[j + 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {

		int arr[] = new int[]{2,5,4,1,8,3,7,9,6};
		new BubbleSort().sorting(arr);
		System.out.println(Arrays.toString(arr));
	}
}
