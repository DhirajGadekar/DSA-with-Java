/*
34] Print an array in Pendulum Arrangement
	Given an array arr of size n. Arrange the elements of the array in a way similar to
	the to-and-fro movement of a Pendulum.
	The minimum element out of the list of integers, must come in the center position
	of the array. If there are even elements, then minimum element should be moved to
	(n-1)/2 index (considering that indexes start from 0)
	The next number (next to minimum) in the ascending order, goes to the right, the
	next to next number goes to the left of the minimum number and it continues like a
	Pendulum.
	As higher numbers are reached, one goes to one side in a to-and-fro manner similar
	to that of a Pendulum

	Example 1:
		Input :
			n=5
			arr[] = {1, 3, 2, 5, 4}
		Output :
			5 3 1 2 4
		Explanation:
			The minimum element is 1, so it is moved to the middle. The next higher
			element 2 is moved to the right of the middle element while the next higher
			element 3 is moved to the left of the middle element and this process is
			continued.
	
		Example 2:
			Input :
				n=5
				arr[] = {11, 12, 31, 14, 5}
			Output :
				31 12 5 11 14
		
		Expected Time Complexity: O(n. Log(n))
		Expected Auxiliary Space: O(n)
		
		Constraints:
			1 <= n <= 10^5
			0 <= arr[i] <= 10^5
 */

import java.util.*;

class Solution {
    
	int[] pendulumArrangement(int arr[], int n) {
        
        	Arrays.sort(arr);
        
       	 	int nums[] = new int[arr.length];
        	n = (n - 1)/ 2;
        	for(int i = 0; i < arr.length; i++) {
            
            		if(i == 0) {
                
                		nums[n] = arr[i];
            		} else if(i % 2 == 0) {
                
                		n -= i;
                		nums[n] = arr[i];
            		} else if(i % 2 != 0) {
                
               	 		n += i;
                		nums[n] = arr[i];
            		}   
        	}
        	return nums;
    	}
}
