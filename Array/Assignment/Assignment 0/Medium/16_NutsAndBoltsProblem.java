
import java.util.*;
class Solution {
    	void matchPairs(char nuts[], char bolts[], int n) {
        
        	Arrays.sort(nuts);
        	Arrays.sort(bolts);
    	}
	public static void main(String[] args) {
		
		char nuts[] = new char[]{'@', '%', '$', '#', '^'};
		char bolts[] = new char[]{'%', '@', '#', '$', '^'};
		new Solution().matchPairs(nuts, bolts, 5);
		for(int i = 0; i < nuts.length; i++) {
	
			System.out.print(nuts[i] + " ");
		}
		System.out.println();
		for(int i = 0; i < bolts.length; i++) {

			System.out.print(bolts[i] + " ");
		}
		System.out.println();
	}
}
