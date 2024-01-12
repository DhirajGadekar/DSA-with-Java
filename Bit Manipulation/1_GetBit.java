class BitManipulation {
	
	public static void main(String[] args) {

		int num = 5;
		int pos = 2;
		int bitMask = 1 << pos;
		if((bitMask & num) == 0) {
		
			System.out.println("Zero");
		} else {
			
			System.out.println("One");
		}
	}
}
