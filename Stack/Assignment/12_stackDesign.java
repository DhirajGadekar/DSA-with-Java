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
        void pop() {

                if(top == null) {

                        System.out.println("Stack is Empty");
                } else {

                        int data = top.data;
                        top = top.next;
                        System.out.println(data + " is Poped");
                }
        }
}
