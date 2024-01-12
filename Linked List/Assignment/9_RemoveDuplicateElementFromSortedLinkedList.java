/*
 * 9] Remove duplicate element from sorted Linked List
 */



/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    
    Node removeDuplicates(Node head) {

        Node left = head;
        Node right = head;
        while(right != null) {

            if(left.data == right.data) {

                right = right.next;
                left.next = right;
            } else {

                left = right;
                right = right.next;
            }
        }

        return head;
    }
}
