/*
 * 21] Count Pair
 */

class Solution {
	
	int countPair(char arr[], int N) {
		
		int  count = 0;
		int pairB = 0;
		int pairC = 0;
		for(int i = 0; i < N; i++) {
			
			if(arr[i] == 'a') {	
			
				count++;
			} else if(arr[i] == 'b') {
				
				pairB = pairB + count;
			}
		       	else if(arr[i] == 'c') {
				
				pairC = pairC + pai	rB;
			}
		}
		return pairC;
	}

	public static void main(String[] args) {
		
		char arr[] = new char[]{'a', 'a', 'b', 'b', 'c', 'c'};
		System.out.println(new Solution().countPair(arr, arr.length));
	}
}
