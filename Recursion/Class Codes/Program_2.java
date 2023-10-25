/*
 * 2] Sum of N numbers using Recursion :
 */

class Recursion {
	
	void fun(int num) {

		int sum = 0;
		for(int i = 1; i <= num; i++) {
			
			sum = sum + i;
		}
		System.out.println(sum);
	}
	int sum(int num) {

		if(num == 1) {
			
			return 1;
		}
		return num + sum(--num);
	}
	public static void main(String[] args) {

		System.out.println("Start Main");
		Recursion obj = new Recursion();
	       	obj.fun(5);
		System.out.println(obj.sum(5));
		System.out.println("End Main");
	}
}	
