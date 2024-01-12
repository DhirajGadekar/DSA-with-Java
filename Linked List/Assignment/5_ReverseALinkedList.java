/*
 * 5] Reverse a Linked List
 */

class Solution {

    Node reverseList(Node head) {

        Node ans = null;
        while(head != null) {
            Node temp = head;
            head = head.next;
            temp.next = ans;
            ans = temp;
        }
        return ans;
    }
}
