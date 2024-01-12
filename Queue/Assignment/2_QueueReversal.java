/*
 * 2] Queue Reversal
 */ 

class Solution {
    
    public Queue<Integer> rev(Queue<Integer> q){

        LinkedList<Integer> revQ = new LinkedList<Integer>();

        while(!q.isEmpty()) {

            revQ.addFirst(q.poll());
        }
        return revQ;
    }
}
