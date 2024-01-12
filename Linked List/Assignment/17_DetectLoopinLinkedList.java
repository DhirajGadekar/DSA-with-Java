/*
 * 17] Detect Loop in linked list
 */

/* Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/


class Solution {
   
    public static boolean detectLoop(Node head){
        Node slow = head, fast = head;
        int flag = 0;
        while (slow != null && fast != null
               && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            return true;
        else
            return false;
    }
}
