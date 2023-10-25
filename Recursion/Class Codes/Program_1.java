/*
 * 1] Print Numbers using recursion :
 */

class Recursion {
	
	void printNumber(int num) {
		
		if(num == 0) {
		
			return;
		}
		printNumber(num - 1);
		System.out.println(num);
	}
	public static void main(String[] args) {
		
		new Recursion().printNumber(5);
	}
}
