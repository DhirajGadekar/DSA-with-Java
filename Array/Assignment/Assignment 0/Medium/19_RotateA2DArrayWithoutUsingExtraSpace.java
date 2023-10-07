/*
 * 19] Rotate a 2D array without using extra space
 */

class Solution {
    	
	void rotateMatrix(int arr[][], int n) {

	    	int arr1[][] = new int[arr.length][arr.length];
	    	int itr = arr.length - 1;

	    	for(int i = 0; i < arr.length; i++) {

	        	for(int j = 0; j < arr.length; j++) {

	             		arr1[i][j] = arr[j][itr];
	        	}
	        	itr--;
	    	}
	    	for(int i = 0; i < arr.length; i++) {

	        	for(int j = 0; j < arr.length; j++){

	            		arr[i][j] = arr1[i][j];
	        	}
	    	}
    	}
}
