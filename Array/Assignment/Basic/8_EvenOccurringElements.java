/*
 8] Even occurring elements :
	Given an array Arr of N integers that contains an odd number of occurrences for all
	numbers except for a few elements which are present even number of times. Find
	the elements which have even occurrences in the array.

Example 1:
	Input:
		N = 11
		Arr[] = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15}
	Output: 12 15 23
Example 2:
	Input:
		N = 5
		Arr[] = {23, 12, 56, 34, 32}
	Output: -1
	Explanation:
		Every integer is present odd number of times.
Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)
Constraints:
	1 ≤ N ≤ 10^5
	0 ≤ Arr[i] ≤ 63
 */
	
import java.util.*;

class Solution {
    ArrayList<Integer> repeatingEven(int[] arr, int n) {
        
        ArrayList<Integer> al = new ArrayList<Integer>();
        Arrays.sort(arr);
        
        int count = 0;
        int temp = arr[0];
        
        for(int i = 0; i <= n; i++) {
            
            if(i != n) {
                if(temp == arr[i]) {
                
                    count++;
                } else {
                
                    if(count % 2 == 0) {
                    
                        al.add(temp);
                    }
                    count = 0;
                    temp = arr[i];
                    i--;
                }
            } else {
                
                if(count % 2 == 0) {
                    
                    al.add(temp);
                }
            }
        }

        if(al.size() == 0) {
            
            al.add(-1);
        }
        return al;
    }
}
