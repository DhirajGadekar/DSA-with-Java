class Solution {
	
	static void printRLDiagonal(int arr[][]) {
		
		for(int i = arr[0].length - 1; i >= 0; i--) {
			
			int num = i;
			int j = 0;
			while(j < arr.length && num >= 0) {
					
				System.out.print(arr[j][num] + " ");
				num--;
				j++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		int arr[][] = new int[][]{{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24},{25, 26, 27, 28, 29, 30}};
		printRLDiagonal(arr);	
	}
}
