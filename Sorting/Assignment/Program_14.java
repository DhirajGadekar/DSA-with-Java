/*
 * Problem Statement 14:
 * Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending
 * order. (sort using : Quicksort algorithm)
 */

import java.util.*;
class Solution {

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
        public static void main(String[] args) {

                int arr[] = new int[]{0, 2, 1, 2, 0};
                new Solution().quicksort(arr, 0, arr.length - 1);
                System.out.println(Arrays.toString(arr));
        }
}

