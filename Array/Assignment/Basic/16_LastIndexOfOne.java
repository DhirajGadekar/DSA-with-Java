/*
 16] Last index of One
	Given a string S consisting only '0's and '1's, find the last index of the '1' present in it.

	Example 1:
		Input:
			S = 00001
		Output:
			4
		Explanation:
			Last index of 1 in the given string is 4.

	Example 2:
		Input:
			0
		Output:
			-1
		Explanation:
			Since, 1 is not present, so output is -1.

	Expected Time Complexity: O(N)
	Expected Auxiliary Space: O(1)
	
	Constraints:
		1 <= |S| <= 10^6
		S = {0,1}
 */

class Solution {
    
	int lastIndex(String s) {
        
        	char arr[] = s.toCharArray();
        	int occur = -1;

        	for(int i = 0; i < arr.length; i++) {
                
            		if(arr[i] == '1') {
                
                		occur = i;
            		}    
        	}
        	return occur;
    	}
}
