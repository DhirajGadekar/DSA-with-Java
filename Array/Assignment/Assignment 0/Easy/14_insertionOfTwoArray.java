/*
Que 14 : Intersection of two Array
	Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of
	elements in the intersection (or common elements) of the two arrays.
	For this question, the intersection of two arrays can be defined as the set containing
	distinct common elements between the two arrays.

	Example 1:
		Input:
			n = 5, m = 3
			a[] = {89, 24, 75, 11, 23}
			b[] = {89, 2, 4}
		Output: 1
		Explanation:
			89 is the only element in the intersection of two arrays.
	Example 2:
		Input:
			n = 6, m = 5
			a[] = {1, 2, 3, 4, 5, 6}
			b[] = {3, 4, 5, 6, 7}
		Output: 4
		Explanation:
			3 4 5 and 6 are the elements in the intersection of two arrays.

	Expected Time Complexity: O(n + m).
	Expected Auxiliary Space: O(min(n,m)).

	Constraints:
		1 ≤ n, m ≤ 105
		1 ≤ a[i], b[i] ≤ 105
 */

class Solution {
    
    	int insertion(int arr1[], int arr2[], int n, int m) {
        
        	ArrayList<Integer> al = new ArrayList<Integer>();
        	for(int i = 0; i < n; i++) {
            
            		al.add(arr1[i]);
        	}
        	int count = 0;
        	for(int i = 0; i < m; i++) {
            
            		if(al.contains(arr2[i])) {
                
                		count++;
            		}
        	}
        	return count;
    	}
    	int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        	
		if(n > m) {
            
            		return new Solution().insertion(a, b, n, m);
        	} else {
           
		       	return  new Solution().insertion(b, a, m, n);
        	}
    	}
}
