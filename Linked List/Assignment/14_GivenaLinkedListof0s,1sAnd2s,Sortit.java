/*
 * 14] Given a linked list of 0s, 1s and 2s, sort it
 */

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {

        ArrayList<Integer> al = new ArrayList<>();
        while(head != null) {

            al.add(head.data);
            head = head.next;
        }
        Collections.sort(al);
        Iterator it = al.iterator();
        Node tail = null;
        while(it.hasNext()) {

            Node node = new Node((int)it.next());
            if(head == null) {

                head = node;
                tail = node;
            } else {

                tail.next = node;
                tail = node;
            }
        }
        return head;
    }
}

