/*
 * 8] Delete without head pointer
 */ 

class Solution {

    void deleteNode(Node del) {

        del.data = del.next.data ^ del.data;
        del.next.data = del.data ^ del.next.data;
        del.data = del.next.data ^ del.data;
        del.next = del.next.next;
    }
}
