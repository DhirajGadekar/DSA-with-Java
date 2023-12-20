import java.util.*;

class Queue {
	
	int queue[];
	int rear;
	int front;
	int maxSize;
	Queue(int size) {
		
		this.queue = new int[size];
		this.rear = -1;
		this.front = -1;
		this.maxSize = size;
	}

	void enqueue(int data) {
		
		if(rear == maxSize - 1) {

			System.out.println("Queue is Full");
		} else if(front == -1) {
			
			front = rear = 0;
			queue[rear] = data;
		} else {
			
			rear++;
			queue[rear] = data;
		}
	}

	int dequeue() {
		
		if(front == -1) {
			
			System.out.println("Queue is Empty");
			return -1;
		} 
		int data;
		if(front == rear) {

			data = queue[front];
			front = rear = -1;
			return data;	
		} else {
			
			data = queue[front];
			front++;
			return data;
		}
	}
	int peek() {
		
		if(front == -1) {
			
			System.out.println("Queue is Empty");
			return -1;
		} else {
			
			return queue[front];
		}
	}
	boolean isEmpty() {

		if(front == -1 && rear == -1) {
			
			return true;
		} else {
			
			return false;
		}
	}
	void printQueue() {
		
		if(front == -1) {
			
			System.out.println("Queue is Empty");
		} else {
			
			for(int i = front; i <= rear; i++) {
				
				System.out.print("|" + queue[i] + "|");
			}
			System.out.println();
		}
	}
}	

class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of queue : ");
		Queue q = new Queue(sc.nextInt());

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
