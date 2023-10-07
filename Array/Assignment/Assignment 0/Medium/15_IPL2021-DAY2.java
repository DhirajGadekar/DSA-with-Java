
import java.util.*;
class Solution {
    	ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        	ArrayList<Integer> al = new ArrayList<Integer>();
                
		int max = Integer.MIN_VALUE;
                for(int i = 0; i <= n - k; i++) {

                        for(int j = i; j < i + k; j++) {

                                if(max < arr[j]) {

                                        max = arr[j];
                                }
                        }
                        al.add(max);
                        max = Integer.MIN_VALUE;
                }
                return al;
    	}
}
