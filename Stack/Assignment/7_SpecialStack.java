/*
 * 7] Special Stack
 */

import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			Solution sl =new Solution();
			while(!sl.isEmpty(s)){
			    sl.pop(s);
			}
			while(!sl.isFull(s,n)){
				sl.push(sc.nextInt(),s);
			}
		System.out.println(sl.min(s));
		}
	}
}

class Solution {
	
	public void push(int a,Stack<Integer> s) {
	    
	    s.push(a);
	}
	public int pop(Stack<Integer> s) {
        
        return s.pop();    
	}
	public int min(Stack<Integer> s) {
        
        int min = Integer.MAX_VALUE;
        Stack<Integer> copiedStack = (Stack<Integer>)s.clone();
        for(int i = 0; i < s.size(); i++) {
            
            int num = copiedStack.pop();
            if(num < min) {
                
                min = num;
            }
        }
        return min;
	}
	public boolean isFull(Stack<Integer> s, int n) {
        if(s.size() == n) {
            
            return true;
        } else {
            
            return false;
        }   
	}
	public boolean isEmpty(Stack<Integer> s) {
        
        if(s.isEmpty()) {
            
            return true;
        } else {
            
            return false;
        }  
	}
}
