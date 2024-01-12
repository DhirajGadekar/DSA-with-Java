/*
 * 4] Doubly linked list Insertion at given position
 */

class LinkedList {

	class Node {

		int data;
		Node prev = null;
		Node next = null;
		Node(int data) {

			this.data = data;
		}
	}
	Node head = null;
	void addFirstNode(int data) {

		Node newNode = new Node(data);
		if(head == null) {

			head = newNode;
		} else {

			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
	}
	void addLastNode(int data) {

		Node newNode = new Node(data);
		if(head == null) {

			head = newNode;
		} else {

			Node temp = head;
			while(temp.next != null) {

				temp = temp.next;
			}
			newNode.prev = temp;
			temp.next = newNode;
		}
	}
	int countNode() {

		int count = 0;
		Node temp = head;
		while(temp != null) {

			count++;
			temp = temp.next;
		}
		return count;
	}

	void addAtPosNode(int pos, int data) {

		int count = countNode();
		if(pos <= 0 || pos > count + 1) {

			System.out.println("Invalid Position");
		} else {

			if(pos == 1) {

				addFirstNode(data);
			} else if(pos == count + 1) {

				addLastNode(data);
			} else {

				Node temp = head;
				Node newNode = new Node(data);
				while(pos - 2 != 0) {

					temp = temp.next;
					pos--;
				}
				temp.next.prev = newNode;
				newNode.next = temp.next;
				newNode.prev = temp;
				temp.next = newNode;
			}
		}
	}
	void printLinkedList() {

		if(head == null) {

			System.out.println("LinkedList is Empty");
		} else {
			Node temp = head;
			while(temp.next != null) {

				System.out.print("|" + temp.data + "|<->");
				temp = temp.next;
			}
			System.out.println("|" + temp.data + "|");
		}
	}
	public static void main(String[] args) {
	
		LinkedList ll = new LinkedList();

		ll.addAtPosNode(1, 10);
		ll.addAtPosNode(2, 30);
		ll.addAtPosNode(2, 20);

		ll.printLinkedList();
	}
}
