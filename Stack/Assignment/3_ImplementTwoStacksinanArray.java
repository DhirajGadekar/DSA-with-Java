/*
 * Problem 3. Implement two stacks in an array
 */

class TwoStacks {
    
	int arr[] = new int[1000];
    	int top1;
    	int top2;
    	TwoStacks() {
        	top1 = -1;
        	top2 = arr.length;
    	}
  
    	void push1(int x) {

        	if(top1 == top2 - 1) {

            		return;
        	} else {

            		top1++;
            		arr[top1] = x;
        	}
    	}
  
    	void push2(int x) {

       		if(top2 == top1 + 1) {

           		return;
       		} else {

           		top2--;
           		arr[top2] = x;
       		}
    	}	
  
    	int pop1() {

        	if(top1 == -1) {

            		return -1;
        	} else {

            		int data = arr[top1];
            		top1--;
            		return data;
        	}
    	}
 
    	int pop2() {

        	if(top2 == arr.length) {

            		return -1;
        	} else {

            		int data = arr[top2];
            		top2++;
            		return data;
        	}
    	}	
}
