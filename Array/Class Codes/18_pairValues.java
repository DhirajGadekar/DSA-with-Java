/*
 * 18] Given a character array(lowercase)
 * 	Return the count pair(i, j) suzch that
 * 	i) i < k
 * 	ii) arr[i] = 'a'
 *          arr[j] = 'g'
 *
 *      Arr = ['a', 'b', 'e', 'g', 'a', 'g']
 */


class Solution {
	
	int countPair(char arr[], int N) {
		
		int count = 0, pair = 0;
		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] == 'a') {
				
				count++;
			} else if(arr[i] == 'g') {
				pair = pair + count;
			}
		}
		return pair;
	}
	public static void main(String[] args) {
		
		char arr[] = new char[]{'a', 'g', 'a', 'g', 'a', 'g'};
		System.out.println(new Solution().countPair(arr, arr.length));
	}
}
