/*
 Program 3 : 
 
 	Given a singly linked list of size N of integers. 
	The task is to check if the given linked list is palindrome or not.

	Example 1:
		Input:
			N = 3
			value[] = {1,2,1}
		Output: 1
		Explanation: The given linked list is
			     1 2 1 , which is a palindrome and
			     Hence, the output is 1.
	
	Example 2:
		Input:
			N = 4
			value[] = {1,2,3,4}
		Output: 0
		Explanation: The given linked list
			     is 1 2 3 4 , which is not a palindrome
			     and Hence, the output is 0.
	
	Your Task:
		The task is to complete the function isPalindrome() which takes head as reference as 
		the only parameter and returns true or false if linked list is palindrome or not respectively.

	Expected Time Complexity: O(N)
	Expected Auxialliary Space Usage: O(1)  (ie, you should not use the recursive stack space as well)

	Constraints:
		1 <= N <= 105
 */

/* Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/

class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        //Your code here
        Node temp = head;
        int count = 0;
        while(temp != null) {
            
            count++;
            temp = temp.next;
        }
        
        int flag = 0;
        int data = 0;
        for(int i = 1; i <= count / 2; i++) {
            
            temp = head;
            if(temp.next == null) {
                
                data = temp.data;
            } else {
                while(temp.next.next != null) {
                
                    temp = temp.next;
                }
                data = temp.next.data;
            }
            if(data == head.data) {
                
                flag = 1;
            } else {
                
                return false;
            }
            head = head.next;
            temp.next = null;
        }
        
        return true;
    }    
}

