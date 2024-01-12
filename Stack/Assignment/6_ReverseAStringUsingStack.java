/*
 * 6] Reverse a string using stack
 */

import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            Solution obj = new Solution();
            System.out.println(obj.reverse(sc.next()));
        }
	}
}

class Solution {

    public String reverse(String S){

        String ans = new String();
        for(int i = S.length() - 1; i >= 0; i--) {

            ans = ans + S.charAt(i);
        }
        return ans;
    }
}
