//Rotate the matrix 90 degree clockwise from top to right

class Solution {

        static void rotateMatrix(int arr[][]) {

                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < i; j++) {

                                int temp = arr[i][j];
                                arr[i][j] = arr[j][i];
                                arr[j][i] = temp;
                        }
                }
		for(int i = 0; i < arr.length; i++) {
			
			int start = 0;
			int end = arr.length - 1;
			while(start < end) {

				int temp = arr[i][start];
				arr[i][start] = arr[i][end];
				arr[i][end] = temp;

				start++;
				end--;
			}
		}
        }
        public static void main(String[] args) {

                int arr[][] = new int[][]{{1, 2, 3, 4, 5, 6},{7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}, {19, 20, 21, 22, 23, 24},{25, 26, 27, 28, 29, 30}, {31, 32, 33, 34, 35, 36}};
                rotateMatrix(arr);

                for(int i = 0; i < arr.length; i++) {

                        for(int j = 0; j < arr[0].length; j++) {

                                System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}

