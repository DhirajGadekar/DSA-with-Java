/*
 * 4] Delete middle element of a stack
 */

class Solution {
    
    public void deleteMid(Stack<Integer>s,int sizeOfStack){

        Stack<Integer> ms = new Stack<Integer>();

        for(int i = 0; i < sizeOfStack; i++) {

            if(i == (sizeOfStack) / 2) {

                s.pop();
            } else {

                ms.push(s.pop());
            }
        }

        for(int i = 0; i < sizeOfStack - 1; i++) {

            s.push(ms.pop());
        }
    }
}
