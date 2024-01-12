/*
 * 10] Identical Linked Lists
 */ 

/*
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}*/

class Solution {

    public boolean isIdentical (Node head1, Node head2){

        while(head1 != null && head2 != null) {

            if(head1.data != head2.data) {

                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        if(head1 == null && head2 == null) {

            return true;
        }
        return false;
    }
}
