/*
 * 4] Doubly Circular LinkedList :
 */

import java.io.*;
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
			newNode.prev = newNode;
			newNode.next = head;
		} else {
			
			Node temp = head;
			while(temp.next != head) {
				
				temp = temp.next;
			}
			newNode.next = head;
			newNode.prev = temp;
			head.prev = newNode;
			temp.next = newNode;
			head = newNode;
		}
	}
	
	void addLastNode(int data) {
			
		Node newNode = new Node(data);
		if(head == null) {

			head = newNode;
                        newNode.prev = newNode;
                        newNode.next = head;
		} else {
			
			Node temp = head;
			while(temp.next != head) {
				
				temp = temp.next;
			}
			newNode.prev = temp;
			newNode.next = head;
			temp.next = newNode;
			head.prev = newNode;
		}
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

				Node newNode = new Node(data);
				Node temp = head;
				while(0 != pos - 2) {

					temp = temp.next;
					pos--;
				}
				newNode.prev = temp;
				newNode.next = temp.next;
				temp.next.prev = newNode;
				temp.next = newNode;
			}

		}
	}
	void deleteFirstNode() {
	
		if(head == null) {
			
			System.out.println("LinkedList is Empty");
		} else if(countNode() == 1) {
		       	
			head = null;
		} else {
			
			Node temp = head;
			while(temp.next != head) {
			
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
			head.prev = temp;
		}
	}
	void deleteLastNode() {
		
		if(head == null) {
			
			System.out.println("LinkedList is Empty");
		} else if(countNode() == 1) {
			
			head = null;
		} else {
			
			Node temp = head;
			while(temp.next.next != head) {
				
				temp = temp.next;
			}
			temp.next = head;
			head.prev = temp;
		}
	}
	void deleteAtPosNode(int pos) {

		int count = countNode();
		if(pos <= 0 || pos > count) {

			System.out.println("Invalid Position");
		} else {
			if(pos == 1) {

				deleteFirstNode();
			} else if(pos == count) {

				deleteLastNode();
			} else {

				Node temp = head;
				while(0 != pos - 2) {

					 temp = temp.next;
					 pos--;
				}
				temp.next.next.prev = temp.next.prev;
				temp.next = temp.next.next;
			}
		}
	}
	int countNode() {
		if(head == null) {
			
			return 0;
		} else {
			
			Node temp = head;
			int count = 0;
			while(temp.next != head) {
				
				count++;
				temp = temp.next;
			}
			return count + 1;
		}
	}
	void printLinkedList() {
	
		if(head == null) {
			
			System.out.println("LinkedList is Empty");
		} else {
			
			Node temp = head;
			while(temp.next != head) {
				
				System.out.print("|" + temp.data + "|<->");
				temp = temp.next;
			}
			System.out.println("|" + temp.data + "|");
		}
	}
}
class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                LinkedList dcl = new LinkedList();

                char ch;
                do {

                        System.out.println("1.Add First Node");
                        System.out.println("2.Add Last Node");
                        System.out.println("3.Add At Position Node");
                        System.out.println("4.Delete First Node");
                        System.out.println("5.Delete Last Node");
                        System.out.println("6.Delete At Position Node");
                        System.out.println("7.count Nodes");
                        System.out.println("8.Print Linked List");

                        System.out.println("Enter Your Choice : ");
                        int choice = Integer.parseInt(br.readLine());

                        int data = 0,pos = 0;
                        switch(choice) {

                                case 1:
                                {
                                        System.out.println("Enter the Data : ");
                                        data = Integer.parseInt(br.readLine());
                                        dcl.addFirstNode(data);
                                }
                                break;

                                case 2:
                                {
                                        System.out.println("Enter the Data : ");
                                        data = Integer.parseInt(br.readLine());
                                        dcl.addLastNode(data);
                                }
                                break;

                                case 3:
                                {
                                        System.out.println("Enter the Position of Node : ");
                                        pos = Integer.parseInt(br.readLine());

                                        System.out.println("Enter the Data : ");
                                        data = Integer.parseInt(br.readLine());

                                        dcl.addAtPosNode(pos, data);
                                }
                                break;

                                case 4:
                                        dcl.deleteFirstNode();
                                        break;

                                case 5:
                                        dcl.deleteLastNode();
                                        break;

                                case 6:
                                        System.out.println("Enter the Position of Node : ");
                                        pos = Integer.parseInt(br.readLine());
                                        dcl.deleteAtPosNode(pos);
                                        break;

                                case 7:
                                        System.out.println("No of Nodes : " + dcl.countNode());
                                        break;

                                case 8:
                                        dcl.printLinkedList();
                                        break;

                                default:
                                        System.out.println("Invalid Choice");
                        }
                        System.out.println("Do you want to continue?");
                        ch = br.readLine().charAt(0);
                } while(ch == 'Y' || ch == 'y');
	}
}	
