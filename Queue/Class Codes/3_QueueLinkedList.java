import java.util.*;

class Queue {

	Node front = null;
	Node rear = null;
	class Node {
		
		Node next = null;
		int data;

		Node(int data) {
			
			this.data = data;
		}
	}
	void enqueue(int data) {
		
		Node newNode = new Node(data);
		if(front == null && rear == null) {
			
			front = newNode;
			rear = newNode;
		} else {
			
			rear.next = newNode;
			rear = newNode;
		}
	}
	int dequeue() {
		
		if(front == null && rear == null) {

			System.out.println("Queue is Empty");
			return -1;
		} 
		int data;
		if(front == rear) {
			
			data = front.data;
			front = rear = null;
			return data;
		} else {
			
			data = front.data;
			front = front.next;
			return data;
		}
	}
	int peek() {
		
		if(front == null && rear == null) {

			System.out.println("Queue is Empty");
			return -1;
		} else {
			
			return front.data;
		}
	}
	boolean isEmpty() {
		
		if(front == null && rear == null) {
			
			return true;
		} else {
			
			return false;
		}
	}
	void printQueue() {
		
		if(front == null && rear == null) {
			
			System.out.println("Queue is Empty");
		} else {
			
			Node temp = front;
			while(temp != null) {
				
				System.out.print("|" + temp.data + "|");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}

class Main {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                Queue q = new Queue();

                char ch;
                do {
                        System.out.println("1.Enqueue");
                        System.out.println("2.Dequeue");
                        System.out.println("3.Peek");
                        System.out.println("4.isEmpty");
                        System.out.println("5.Print Queue");

                        System.out.println("Enter your choice : ");
                        int choice = sc.nextInt();

                        switch(choice) {

                                case 1:
                                        System.out.println("Enter Data : ");
                                        q.enqueue(sc.nextInt());
                                        break;
                                case 2:
                                        System.out.println(q.dequeue());
                                        break;
                                case 3:
                                        System.out.println(q.peek());
                                        break;
                                case 4:
                                        System.out.println(q.isEmpty());
                                        break;
                                case 5:
                                        q.printQueue();
                                        break;
                                default :
                                        System.out.println("Invalid Choice");
                        }
                        System.out.println("Do you want continue?");
                        ch = sc.next().charAt(0);
                } while(ch == 'y' || ch == 'Y');
        }
}

