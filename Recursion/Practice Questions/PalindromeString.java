/* * 
 * Qu 4. Write a Java recursive method to check if a given string is a palindrome.
 */

import java.io.*;
class Solution {
	
	boolean palindromeString(String str, int start, int end) {
		
		if(start >= end) {
			
			return true;
		}
		if(str.charAt(start) != str.charAt(end)) {
			
			return false;
		}
		return palindromeString(str, ++start, --end);
	}
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Solution s = new Solution();

		System.out.println("Enter String : ");
		String str = br.readLine();

	  	boolean ret = s.palindromeString(str, 0, str.length() - 1);
		if(ret == true) {
			
			System.out.println("String is Palindrome");
		} else {

			System.out.println("String is Not Palindrome");
		}
	}
}
