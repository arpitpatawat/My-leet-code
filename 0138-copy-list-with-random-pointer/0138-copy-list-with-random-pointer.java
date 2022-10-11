/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        // Step 1: copy node in b/w
        Node itr = head;
        while(itr != null){
            Node next = itr.next;
            Node alp = new Node(itr.val);
            itr.next = alp;
            alp.next = next;
            itr = itr.next.next;
        }
        
        // step 2: make the same random pointer for the copied nodes
        itr = head;
        while(itr != null){
            if(itr.random != null){
            itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
        }
        
        // step 3: remove the connection b/w original and copied nodes
        itr = head;
        Node res = itr.next;
        Node zz = res;
        while(itr != null){
            itr.next = res.next;
            itr = itr.next;
            if(itr == null){
                res.next = null;
                return zz;
            }
            res.next = itr.next;
            res = res.next;
        }
        return zz;
    }
}