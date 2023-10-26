// print right Diagonal :

class Solution {

        public static void main(String[] args) {

                int arr[][] = new int[][]{{1,2,3,4}, {5,6,7,8}, {9, 10, 11, 12},{13, 14, 15, 16}};

                int i = 0;
		int j = arr.length - 1;
		while(i < arr.length && j >= 0) {
			
			System.out.println(arr[i][j]);
			i++;
			j--;
		}
        }
}
