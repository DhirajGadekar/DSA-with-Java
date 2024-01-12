/*
 * 5] Implement Stack using Linked List
 */

import java.util.*;

class StackNode {
    int data;
    StackNode next;
    StackNode(int a) {
        data = a;
        next = null;
    }
}

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            MyStack obj = new MyStack();
            int Q = sc.nextInt();
            while (Q > 0) {
                int QueryType = 0;
                QueryType = sc.nextInt();
                if (QueryType == 1) {
                    int a = sc.nextInt();
                    obj.push(a);
                } else if (QueryType == 2) {
                    System.out.print(obj.pop() + " ");
                }
                Q--;
            }
            System.out.println("");
            t--;
        }
    }
}

class MyStack {
    StackNode top = null;
    void push(int a) {
        
        StackNode node = new StackNode(a);
        node.next = top;
        top = node;
    }
    int pop()  {
        if(top == null) {
            
            return -1;
        } else {
            
            int data = top.data;
            top = top.next;
            return data;
        }
    }
}
