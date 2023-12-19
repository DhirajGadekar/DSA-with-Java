class Stack {
	
	int maxSize;
	int stack[];
	int top = -1;
	Stack(int size) {
		
		this.maxSize = size;
		this.stack = new int[size];
	}
	void push(int data) {
		
		if(maxSize-1 == top) {
			
			System.out.println("Stack is OverFlow");
		} else {

			top++;
			stack[top] = data;
		}
	}

	int pop() {
		
		if(top == -1) {
			
			System.out.println("Stack is Empty");
		} else {
			
			int data = stack[top];
			top--;
			return data;
		}
		return -1;
	}

	int peek() {
		
		if(top == -1) {
			
			System.out.println("Stack is Empty");
		} else {
			
			return stack[top];
		}
		return -1;
	}
	boolean isEmpty() {
			
		if(top == -1) {
			
			return true;
		} else {
			
			return false;
		}
	}
	int size() {
		
		int count = 0;
		for(int i = 0; i <= top; i++) {
			
			count++;
		}
		return count;
	}
	void stackPrint() {
		
		if(top == -1) {
			
			System.out.println("Stack is Empty");	
		} else {

			System.out.print("[");
			for(int i = 0; i < top; i++) {
				
				System.out.print(stack[i] + ", ");
			}
			System.out.println(stack[top] + "]");
		}
	}
}

class Main {
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);

		stack.stackPrint();
		System.out.println(stack.pop());
		stack.stackPrint();
		System.out.println(stack.size());
		System.out.println(stack.peek());
		System.out.println(stack.isEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
	}
}	
