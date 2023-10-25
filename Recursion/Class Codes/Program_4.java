/*
 * 4] Double Recursion :
 */

class Recursion {
	
	int fun(int num) {

		if(num <= 1) {

			return 1;
		}
		return fun(num - 2) + fun(num - 1);
	}
	public static void main(String[] args) {
		
		int ret = new Recursion().fun(5);
		System.out.println(ret);
	}
}
