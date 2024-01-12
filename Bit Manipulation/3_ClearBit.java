class BitManipulation {
	
	public static void main(String[] args) {
		
		int num = 5;
		int pos = 2;
		int bitMask = 1 << pos;
		System.out.println(~(bitMask) & num);
	}
}
