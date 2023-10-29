/*
 * 9. WAP to print string in reverse order.
 */

class Solution {
	
	void printString(String str) {
		
		for(int i = str.length() - 1; i >= 0; i--) {
		
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
	void printRevString(String str, int length) {
		
		if(length == 0) {
			 
			return;
		}
		--length;
		System.out.print(str.charAt(length));
		printRevString(str, length);
	}
	public static void main(String[] args) {
		
		Solution obj = new Solution();
		String str = "Dhiraj";
		obj.printString(str);
		obj.printRevString(str, str.length());
		System.out.println();
	}
}
