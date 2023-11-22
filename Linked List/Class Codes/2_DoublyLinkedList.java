/*
 * 2] Doubly LinkedList : 
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
	void deleteFirstNode() {
		
		if(head == null) {

			System.out.println("LinkedList is Empty");
		} else {
			
			head = head.next;
			head.prev = null;
		}
	}
	
	void deleteLastNode() {

		if(head == null) {
			
			System.out.println("LinkedList is Empty");
		} else if(countNode() == 1) {
				
			head = null;
		}else {
			
			Node temp = head;
			while(temp.next.next != null) {
			
				temp = temp.next;
			}
			temp.next = temp.next.next;
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
				while(pos - 2 != 0) {
				
					temp = temp.next;
					pos--;
				}
				temp.next = temp.next.next;
				temp.next.prev = temp;
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

}

class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                LinkedList dl = new LinkedList();

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
                                        dl.addFirstNode(data);
                                }
                                break;

                                case 2:
                                {
                                        System.out.println("Enter the Data : ");
                                        data = Integer.parseInt(br.readLine());
                                        dl.addLastNode(data);
                                }
                                break;

                                case 3:
                                {
                                        System.out.println("Enter the Position of Node : ");
                                        pos = Integer.parseInt(br.readLine());

                                        System.out.println("Enter the Data : ");
                                        data = Integer.parseInt(br.readLine());

                                        dl.addAtPosNode(pos, data);
                                }
                                break;

                                case 4:
                                        dl.deleteFirstNode();
                                        break;

                                case 5:
                                        dl.deleteLastNode();
                                        break;

                                case 6:
                                        System.out.println("Enter the Position of Node : ");
                                        pos = Integer.parseInt(br.readLine());
                                        dl.deleteAtPosNode(pos);
                                        break;

                                case 7:
                                        System.out.println("No of Nodes : " + dl.countNode());
                                        break;

                                case 8:
                                        dl.printLinkedList();
                                        break;

                                default:
                                        System.out.println("Invalid Choice");
                        }
                        System.out.println("Do you want to continue?");
                        ch = br.readLine().charAt(0);
                } while(ch == 'Y' || ch == 'y');

	}	
}
