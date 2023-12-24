class Solution {
    int arr[];
    int top;
    int size;
    Solution(int size) {
        
        this.arr = new int[size];
        this.top = -1;
        this.size = size;
    }
    Solution() {
        
    }
    void push(int data) {
            
        if(size -1 == top) {
            return;
        } else {
            top++;
            arr[top] = data;
            return;
        }
    }
    int pop() {
        if(top == -1) {
            return ' ';
        } else {
            int data = arr[top];
            top--;
            return data;
        }
    }
    public static int evaluatePostFix(String S) {
            
        Solution obj = new Solution(S.length());    
        for(int i = 0; i < S.length(); i++) {
            
            if(S.charAt(i) == '+' || S.charAt(i) == '/' || S.charAt(i) == '*' || S.charAt(i) == '-') {
                
                int a = obj.pop();
                int b = obj.pop();
                if(S.charAt(i) == '+') {
                    
                    obj.push(a+b);
                } else if(S.charAt(i) == '-') {
                    obj.push(b-a);
                } else if(S.charAt(i) == '*') {
                    obj.push(a*b);
                }else {
                    obj.push(b/a);
                }
            } else {
                obj.push(Character.getNumericValue(S.charAt(i)));
            }
        }
        return obj.pop();
    }
}
