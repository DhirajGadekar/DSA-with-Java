/*
 * Problem 2. Implement stack using array
 */

class MyStack {
	int top;
	int arr[] = new int[1000];

    	MyStack() {
		
		top = -1;
	}

	void push(int a) {
		
		if(top == arr.length - 1) {

	        	return;
	    	} else {
	        	top++;
	        	arr[top] = a;
	    	}
	}

    	int pop() {
        	if(top == -1) {

            		return -1;
        	} else {

            		int data = arr[top];
            		top--;
            		return data;
        	}
	}
}
