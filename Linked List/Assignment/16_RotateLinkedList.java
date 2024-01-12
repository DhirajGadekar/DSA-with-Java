/*
 * 16] Rotate Linked List
 */



/* node of linked list:

class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}

*/

class Solution{
    //Function to rotate a linked list.
    int countNode(Node head) {

        int count = 0;
        while(head != null) {

            count++;
            head = head.next;
        }
        return count;
    }
    public Node rotate(Node head, int k) {
        int count = countNode(head);

        if(k != count) {
            Node temp1 = head;
            for(int i = 1; i < k%count; i++) {
                temp1 = temp1.next;
            }
            Node temp2 = temp1.next;
            temp1.next = null;

            temp1 = temp2;
            while(temp1.next != null) {

                temp1 = temp1.next;
            }
            temp1.next = head;
            head = temp2;
        } else {
            return head;
        }
        return head;
    }
}
