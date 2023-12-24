/*
 * 25. Finding middle element in a linked list
	Given a singly linked list of N nodes.
	The task is to find the middle of the linked list. For example, if the linked list is
	1-> 2->3->4->5, then the middle node of the list is 3.
	If there are two middle nodes(in case, when N is even), print the second middle element.
	For example, if the linked list given is 1->2->3->4->5->6, then the middle node of the list is 4.
	Example 1:
		Input:
			LinkedList: 1->2->3->4->5
		Output: 3
		Explanation: Middle of the linked list is 3.
	Example 2:
		Input:
			LinkedList: 2->4->6->7->5->1
		Output: 7
		Explanation: Middle of the linked list is 7.

	Expected Time Complexity: O(N).
	Expected Auxiliary Space: O(1).
	
	Constraints:
		1 <= N <= 5000
 */

class LinkedList {

        Node head = null;
        class Node {

                Node next;
                int data;
                Node(int data) {

                        this.data = data;
                        this.next = null;
                }
        }
        void addNode(int data) {

                Node newNode = new Node(data);
                if(head == null) {

                        head = newNode;
                } else {

                        Node temp = head;
                        while(temp.next != null) {

                                temp = temp.next;
                        }
                        temp.next = newNode;
                }
        }
	
	int middleelement() {
		Node temp = head;
		int count = 0;
		while(temp != null) {
			
			count++;
			temp = temp.next;
		}
		temp = head;
		for(int i = 0; i < count/2; i++) {
			
			temp = temp.next;
		}
		return temp.data;
	}
}
class Main {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.addNode(1);
		ll.addNode(2);
		ll.addNode(3);
		ll.addNode(4);
		ll.addNode(5);
		ll.addNode(6);
		
		System.out.println(ll.middleelement());
	}
}
