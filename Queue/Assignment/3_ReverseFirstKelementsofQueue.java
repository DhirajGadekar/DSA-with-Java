/*
 * 3] Reverse First K elements of Queue
 */

import java.util.*;

class Solution {
    
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        while(!q.isEmpty()) {
            
            if(k > 0) {
                
                ll.addFirst(q.poll());
            } else {
                
                ll.add(q.poll());
            }
            k--;
        }
        return ll;
    }
}

