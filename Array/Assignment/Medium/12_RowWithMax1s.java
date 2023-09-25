
class Solution {
    	int rowWithMax1s(int arr[][], int n, int m) {
        	
		int max = Integer.MIN_VALUE;
        	int count = Integer.MIN_VALUE;
        	int row = -1;
        	
		for(int i = 0; i < n; i++) {
            		count = Integer.MIN_VALUE;
            		for(int j = 0; j < m; j++) {
                
                		if(arr[i][j] == 1) {
                    
                    			count++;
                		}
            		}
            		if(max < count) {
                
                		max = count;
                		row = i;
            		}
        	}
        	return row;
    	}
}
