// print the sum of every single subArray using carry forward :

class Solution {

        public static void main(String[] args) {

                int arr[] = new int[]{1,2,3,4};

                for(int i = 0; i < arr.length; i++) {

			int sum = 0;
                        for(int j = i; j < arr.length; j++) {

				System.out.println(sum += arr[j]);
                        }
                }
        }
}

