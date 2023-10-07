/*
 * 27] Smallest Positive missing number
 */

import java.util.*;
class Solution {
    
    	int missingNumber(int nums[], int size) {
        	
	    	Arrays.sort(nums);
        
        	int itr = 1;
        	int index = 0;
        	for(int i = 0; i < nums.length; i++) {
            
            		if(nums[i] <= 0) {
                		
				index = i + 1;
            		}
            		if(nums[i] > 0) {
                
                		if(nums[i] == itr) {
                    
                    			itr++;
                		} else if(nums[index] != 1) {
                
                    			return 1;
                		} else if(nums[i] == nums[i - 1]) {
                    
                    			continue;
                		} else {
                    
                    			break;
                		}
            		}
        	}
        	return itr;
    	}	
}
