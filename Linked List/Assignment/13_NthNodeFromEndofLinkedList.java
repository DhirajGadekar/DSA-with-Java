/*
 * 13] Nth node from end of linked list
 */ 

/* Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/

class Solution {

    int getNthFromLast(Node head, int n) {
    	Node temp = head;
    	int count = 0;
    	while(temp != null) {

    	    count++;
    	    temp = temp.next;
    	}
    	temp = head;
    	if(n > count) {

    	    return -1;
    	}

    	for(int i = 1; i <= count - n; i++) {

    	    temp = temp.next;
    	}
    	return temp.data;
    }
}
