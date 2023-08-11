/* *
 * Qu 6. Write a Java recursive method to reverse a given string.
 */

class Solution {

	String reverseString(char str[], int start, int end) {
		
		if(str.length == 0 || start >= end) {
			
			return new String(str);
		}
		
		char temp = str[start];
		str[start] = str[end];
		str[end] = temp;
		return reverseString(str, ++start, --end);
	}

	public static void main(String[] args) {
		
		Solution s = new Solution();
		
		String str = "Dhiraj";
		System.out.println(s.reverseString(str.toCharArray(), 0, str.length()-1));
	}
}
