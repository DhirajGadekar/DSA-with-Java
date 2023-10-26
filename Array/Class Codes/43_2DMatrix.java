//print Boundarys in clockwise fashion :

class Solution {

        static void printBoundary(int arr[][]) {
			
		int i = 0;
		int j = 0;
		int N = arr.length;
                for(int x = 0; x < N - 1; x++) {
			
			System.out.println(arr[i][j]);
			j++;
                }
                for(int x = 0; x < N - 1; x++) {
			
			System.out.println(arr[i][j]);
			i++;
                }
		
                for(int x = 0; x < N - 1; x++) {
			
			System.out.println(arr[i][j]);
			j--;
                }

                for(int x = 0; x < N - 1; x++) {
			
			System.out.println(arr[i][j]);
			i--;
                }
        }
        public static void main(String[] args) {

                int arr[][] = new int[][]{{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24},{25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36}};
                printBoundary(arr);
        }
}

