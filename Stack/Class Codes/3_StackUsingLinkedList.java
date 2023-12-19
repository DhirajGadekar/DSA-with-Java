import java.io.*;

class StackMethods {
	
	Stack top = null;
	class Stack {
		
		Stack next = null;
		int data = 0;
		Stack(int data) {
			
			this.data = data;
		}
	}
	void push(int data) {
		
		Stack newFrame = new Stack(data);
		newFrame.next = top;
		top = newFrame;
	}
	
	boolean isEmpty() {
		
		if(top == null) {
			
			return true;
		} else {
			
			return false;
		}
	}
	void pop() {
		
		if(top == null) {
			
			System.out.println("Stack is Empty");
		} else {
			
			int data = top.data;
			top = top.next;
			System.out.println(data + " is Poped");
		}
	}
	void peek() {
		
		if(top == null) {
			
			System.out.println(" Stack is Empty");
		} else {
			
			System.out.println(top.data + " is a Peek Element");
		}
	}
	int size() {
		
		if(top == null) {
			
			return 0;
		} else {
			
			Stack temp = top;
			int count = 0;
			while(temp != null) {
				
				count++;
				temp = temp.next;
			}
			return count;
		}
	}
	void printStack() {
		
		if(top == null) {

			System.out.println("Stack is Empty");
		} else {
			
			Stack temp = top;
			int count = 0;
			while(temp != null) {
				if(count == 0) {
					
					System.out.println("------");
					System.out.println("| " + temp.data + " |" + " <--Top");
					System.out.println("------");
				} else {

					System.out.println("| " + temp.data + " |");
					System.out.println("------");
				}
				count++;
				temp = temp.next;
			}
		}
	}
	public static void main(String[] args) throws IOException {

		StackMethods sm = new StackMethods();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		char ch;
		do {
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Peek");
			System.out.println("4. isEmpty");
			System.out.println("5. Size");
			System.out.println("6. Print Stack");

			System.out.println("Enter Your Choice : ");
			int choice = Integer.parseInt(br.readLine());

			switch(choice) {
				
				case 1:
					System.out.println("Enter Data : ");
					sm.push(Integer.parseInt(br.readLine()));
					break;
				case 2:
					sm.pop();
					break;
				case 3:
					sm.peek();
					break;
				case 4:
					System.out.println(sm.isEmpty());
					break;
				case 5:
					System.out.println(sm.size());
					break;
				case 6:
					sm.printStack();
					break;
				default :
					System.out.println("Invalid Choice");
			}

			System.out.println("Do you want continue?");
			ch = br.readLine().charAt(0);

		} while(ch == 'Y' || ch == 'y');
	}
}
