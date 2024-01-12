/*
 * 18] Remove loop in Linked List
 */

/*
class Node
{
    int data;
    Node next;
}
*/

class Solution {
    
    public static void removeLoop(Node head){

        if(head.next == null || head == head.next) {

            head.next = null;
            return;
        }
        HashMap<Node, Integer> map = new HashMap<Node, Integer>();
        map.put(head, head.data);
        while (head.next != null){

            if(map.containsKey(head.next)) {

                head.next = null;
                break;
            }
            map.put(head.next, head.data);
            head = head.next;
        }
    }
}
