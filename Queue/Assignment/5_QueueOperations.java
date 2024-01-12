/*
 * 5] Queue Operations
 */

class Solution {

    static void insert(Queue<Integer> q, int k){


        q.offer(k);
    }

    static int findFrequency(Queue<Integer> q, int k){

        int count = 0;
        Iterator it = q.iterator();
        while(it.hasNext()) {

            if((int)it.next() == k) {

                count++;
            }
        }
        return count;
    }

}
