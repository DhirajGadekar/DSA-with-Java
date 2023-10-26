//print All SubArray :

class Solution {
        
        public static void main(String[] args) {
        
                int arr[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};

		for(int i = 0; i < arr.length; i++) {
			
			for(int j = i; j < arr.length; j++) {
				
				for(int k = i; k <= j; k++) {
					
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
        }
} 
