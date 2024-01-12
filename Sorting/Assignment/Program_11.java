/*
 * Problem statement 11:
Given an array arr[], its starting position l and its ending position r. Sort the array
using the Merge Sort algorithm and also solve using the Quick Sort algorithm.
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
}

class QuickSort {

        int partition(int arr[], int start, int end) {

                int pivot = arr[end];
                int i = start - 1;
                for(int j = start; j < end; j++) {

                        if(arr[j] < pivot) {
                                i++;
                                int temp = arr[i];
                                arr[i] = arr[j];
                                arr[j] = temp;
                        }
                }

                int temp = arr[i + 1];
                arr[i + 1] = arr[end];
                arr[end] = temp;

                return i + 1;
        }
        void quicksort(int arr[], int start, int end) {

                if(start < end) {

                        int pivotIndex = partition(arr, start, end);
                        quicksort(arr, start, pivotIndex - 1);
                        quicksort(arr, pivotIndex + 1, end);
                }
        }
        
}

class Main {
        
	public static void main(String[] args) {
		
		int arr1[] = new int[]{4,1,2,5,3};
		new MergeSort().mergesort(arr1, 0, arr1.length - 1);
		System.out.println(Arrays.toString(arr1));

                int arr[] = new int[]{10,4,5,3,8,1,9,2,6,7};
                new QuickSort().quicksort(arr, 0, arr.length - 1);
                System.out.println(Arrays.toString(arr));
        }
}
