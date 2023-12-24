/*
 * 1. Count nodes of linked list
	Given a singly linked list. The task is to find the length of the linked list, where length is defined
	as the number of nodes in the linked list.
	Example 1:
		Input:
			LinkedList: 1->2->3->4->5
		Output: 5
		Explanation: Count of nodes in the linked list is 5, which is its length.
	
	Example 2:
		Input:
			LinkedList: 2->4->6->7->5->1->0
		Output: 7
		Explanation: Count of nodes in the linked list is 7. Hence, the output is 7.

	Expected Time Complexity : O(N)
	Expected Auxiliary Space : O(1)
	
	Constraints:
		1 <= N <= 10^5
		1 <= value <= 10^3
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
	int countNodes() {
			
		int count = 0;
		Node temp = head;
		while(temp != null) {

			count++;
			temp = temp.next;
		}
		return count;
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

		System.out.println(ll.countNodes());
	}
}
