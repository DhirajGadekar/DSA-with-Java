import java.util.*;

class PredefineStack {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.empty());

		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);

		System.out.println(stack);

		System.out.println(stack.pop());
		
		System.out.println(stack.peek());

		System.out.println(stack);

		System.out.println(stack.size());

	}
}
