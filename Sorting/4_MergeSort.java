/*
 * 4] Merge Sort :
 */

import java.util.*;
class MergeSort {
	
	void merge(int arr[], int start, int mid, int end) {
		
		int n1 = mid - start + 1;
		int n2 = end - mid;

		int nums1[] = new int[n1];
		int nums2[] = new int[n2];
		for(int i = 0; i < n1; i++) {
			
			nums1[i] = arr[start + i];
		}
		for(int i = 0; i < n2; i++) {
			
			nums2[i] = arr[mid + i + 1];
		}
		int itr1 = 0, itr2 = 0, itr3 = start;
		while(itr1 < nums1.length && itr2 < nums2.length) {
			
			if(nums1[itr1] < nums2[itr2]) {
				
				arr[itr3] = nums1[itr1];
				itr1++;
			} else {
					
				arr[itr3] = nums2[itr2];
				itr2++;
			}
			itr3++;
		}
		while(itr1 < nums1.length) {
			
			arr[itr3] = nums1[itr1];
			itr1++;
			itr3++;
		}
		while(itr2 < nums2.length) {
		
			arr[itr3] = nums2[itr2];
			itr2++;
			itr3++;
		}
	}
	void mergesort(int arr[], int start, int end) {
		if(start < end) {
			
			int mid = (start + end) / 2;
			mergesort(arr, start, mid);
			mergesort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}
	}
	public static void main(String[] args) {
		
		int arr[] = new int[]{4,5,3,8,1,9,2,6,7};
		new MergeSort().mergesort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}
