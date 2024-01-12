/*
 * 11] Insert in Middle of Linked List
 */

/*
Structure of node class is:
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/
class Solution {

    int countNode(Node head) {

        int count = 0;
        while(head != null) {

            count++;
            head = head.next;
        }
        return count;
    }
    public Node insertInMid(Node head, int data){

        int count = (countNode(head) + 1)/2;
        Node temp = head;
        while(count-1 > 0) {

            count--;
            temp = temp.next;
        }
        Node node = new Node(data);
        node.next = temp.next;
        temp.next = node;
        return head;
    }
}
