/*
 * Problem 3:
	Given a string s and an array of string words, determine whether s is a prefix string of words.
	A string s is a prefix string of words if s can be made by concatenating the first k strings in words
	for some positive k no larger than words.length.
	Return true if s is a prefix string of words, or false otherwise.

	Example 1:
		Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
		Output: true
		Explanation: s can be made by concatenating "i", "love", and "leetcode" together.
	Example 2:
		Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
		Output: false
		Explanation: It is impossible to make s using a prefix of arr.

	Constraints:
		1 <= words.length <= 100
		1 <= words[i].length <= 20
		1 <= s.length <= 1000
	words[i] and s consist of only lowercase English letters.
 */

class Solution {
	
	boolean prefixString(String arr[], String s) {
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i == 0) {
							
			} else {
				
				arr[i] = arr[i - 1] + arr[i];
			}
			if(arr[i].equals(s)) {
				
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
			
		String words[] = new String[]{"i","love","leetcode","apples"};
		String s = "iloveleetcode";
		System.out.println(new Solution().prefixString(words, s));

	}
}
