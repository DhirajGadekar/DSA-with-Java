/*
 * 1] Subarray with given sum
 */

class Solution {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)  {
       
       ArrayList<Integer> al = new ArrayList<Integer>();

       for(int i = 0; i < n; i++) {
           
           int sum = 0;
           for(int j = i; j < n; j++) {
               
                sum = sum + arr[j];
                if(sum == s) {
                    
                    al.add(0, i + 1);
                    al.add(1, j + 1);
                    return al;
                }
           }
       }
       al.add(-1);
       return al;
    }
}
