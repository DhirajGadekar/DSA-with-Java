/*
 * 28] Find Missing And Repeating
 */

import java.uitl.*;
class Solve {
    	int[] findTwoElement(int arr[], int n) {

        	Arrays.sort(arr);
        	int itr = 1;
        	int nums[] = new int[2];
       
	       	nums[0] = -1;
       	 	nums[1] = -1;
        	ArrayList<Integer> al = new ArrayList<Integer>();
        	if(arr[0] != 1) {

            		nums[1] = 1;
        	}
        	for(int i = 0; i < n; i++) {

            		if(!al.contains(arr[i])) {

                		al.add(arr[i]);
            		} else {

                		nums[0] = arr[i];
            		}
            		if(arr[0] == 1) {
                		if(arr[i] == itr) {

                    			itr++;
                		} else if(arr[i] == arr[i - 1]) {

                    			continue;
                		} else {

                    			continue;
                		}
            		}
        	}
        	nums[1] = itr;
        	return nums;
    	}
}
