/*
 * 15] Remove duplicates from an unsorted linked list
 */  
class Solution {
    
    public Node removeDuplicates(Node head)  {
        
        if (head == null || head.next == null) {
            
            return head;
        }

        HashSet<Integer> uniqueSet = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current != null) {   
        
            if (!uniqueSet.contains(current.data)) {
                
                uniqueSet.add(current.data);
                prev = current;
                current = current.next;
            } else {
                prev.next = current.next;
                current = current.next;
            }
        }
        return head;
    }
}
