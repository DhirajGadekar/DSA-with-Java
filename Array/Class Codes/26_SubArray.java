//Print the sum of every single subArray:

class Solution {

        public static void main(String[] args) {

                int arr[] = new int[]{1,2,3,4,5};

                for(int i = 0; i < arr.length; i++) {

                        for(int j = i; j < arr.length; j++) {
				
				int sum = 0;
                                for(int k = i; k <= j; k++) {

                                        sum = sum + arr[k];
				}
                                System.out.println(sum);
                        }
                }
        }
}

