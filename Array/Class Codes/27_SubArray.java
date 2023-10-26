//print the sum of every single subArray using prefix technique :

class Solution {

        public static void main(String[] args) {

                int arr[] = new int[]{1,2,3,4};
	
		for(int i = 1; i < arr.length; i++) {
			
			arr[i] = arr[i] + arr[i - 1];
		}
                for(int i = 0; i < arr.length; i++) {

                        for(int j = i; j < arr.length; j++) {
		
                		if(i == 0) {

					System.out.println(arr[j]);
				} else {
						
					System.out.println(arr[j] - arr[i - 1]);
				}	
                        }
                }
        }
}

