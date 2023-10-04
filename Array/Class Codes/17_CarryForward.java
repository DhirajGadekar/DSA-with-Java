/*
 * 17] Given a character array(lowercase)
 * 	Return the count pair(i, j) suzch that
 * 	i) i < k
 * 	ii) arr[i] = 'a'
 *          arr[j] = 'g'
 *
 *      Arr = ['a', 'b', 'e', 'g', 'a', 'g']
 */

class Solution {
	
	int countPair(char arr[], int N) {
		
		int count = 0;
		for(int i = 0; i < N; i++) {

			if(arr[i] == 'a') {
				for(int j = i + 1; j < N; j++) {
				
					if(arr[j] == 'g') {
					
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		
		char arr[] = new char[]{'a', 'b', 'e', 'g', 'a', 'g'};
		int countpair = new Solution().countPair(arr, arr.length);
		System.out.println(countpair);
	}
}
