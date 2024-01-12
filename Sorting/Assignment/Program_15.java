/*
 * Problem Statement 15:
 * Given a random set of numbers, Print them in sorted order.
 * Use : merge and quicksort
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
		
		int arr1[] = new int[]{1, 5, 3, 2};
		new MergeSort().mergesort(arr1, 0, arr1.length - 1);
		System.out.println(Arrays.toString(arr1));

                int arr2[] = new int[]{3, 1};
                new QuickSort().quicksort(arr2, 0, arr2.length - 1);
                System.out.println(Arrays.toString(arr2));
        }
}
