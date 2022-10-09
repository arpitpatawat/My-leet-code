/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {

    public Node flatten(Node head) {
        Node x = head;
        while (x != null) {
            if (x.child == null) {
                x = x.next;
                continue;
            }
            Node next = x.next;
            Node temp = x.child;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = next;
            if (next != null) next.prev = temp;
            x.next = x.child;
            x.child = null;
            x.next.prev = x;
            x = x.next;
        }

        return head;
    }
}
