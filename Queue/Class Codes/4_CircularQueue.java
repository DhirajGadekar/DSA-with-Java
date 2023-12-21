import java.util.*;

class CircularQueue {
	
	int queue[];
	int front;
	int rear;
	int maxSize;
	CircularQueue(int size) {
		
		this.queue = new int[size];
		this.front = -1;
		this.rear = -1;
		this.maxSize = size;
	}

	void enqueue(int data) {
		
		if((front == 0 && rear == maxSize - 1) || (rear % maxSize == front -1)) {
			
			System.out.println("Queue is full");
			return;
		} else if(front == -1 && rear == -1) {	
			
			front = rear = 0;
		} else if(rear == maxSize -1 && front != 0) {
			
			rear = 0;
		} else {
			
			rear++;
		}
		queue[rear] = data;
	}
	void dequeue() {
		
		if(front == -1 && rear == -1) {
			
			System.out.println("Queue is Empty");
		} else if(front == rear) {
			
			System.out.println(queue[front] + " is Poped");
			front = rear = -1;
		} else if(front == maxSize - 1 && rear != maxSize) {
			
			System.out.println(queue[front] + " is Poped");
			front = 0;
		} else {
			
			System.out.println(queue[front] + " is Poped");
			front++;
		}
	}
	void peek() {
		
		if(front == -1 && rear == -1) {
			
			System.out.println("Queue is Empty");
		} else {
			
			System.out.println(queue[front] + " is Peek Element");
		}
	}
	void printQueue() {
		
		if(front <= rear) {
			
			for(int i = front; i <= rear; i++) {

				System.out.print(queue[i] + " ");
			}
		} else {
			
			for(int i = front; i < maxSize; i++) {

				System.out.print(queue[i] + " ");
			}
			for(int i = 0; i <=rear; i++) {
				
				System.out.print(queue[i] + " ");
			}
		}
		System.out.println();
	}
}
class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Queue : ");
		CircularQueue cq = new CircularQueue(sc.nextInt());

		char ch;
		do {
			System.out.println("1.Enqueue");
			System.out.println("2.Dequeue");
			System.out.println("3.Peek");
			System.out.println("4.Print Queue");

			System.out.println("Enter your choice : ");
			int choice = sc.nextInt();

			switch(choice) {
				
				case 1:
					System.out.println("Enter the Data : ");
					cq.enqueue(sc.nextInt());
					break;
				case 2:
					cq.dequeue();
					break;
				case 3:
					cq.peek();
					break;
				case 4:
					cq.printQueue();
					break;
				default:
					System.out.println("Invalid Choice");
			}
			System.out.println("Do you to continue?");
			ch = sc.next().charAt(0);
		} while(ch == 'Y' || ch == 'y');
	}
}
