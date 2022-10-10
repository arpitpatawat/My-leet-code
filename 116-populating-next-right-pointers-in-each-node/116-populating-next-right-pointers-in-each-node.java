

class Solution {
    public void helper(Node curr , Node next){
        // base case when curr is null
        if(curr == null) return ;
        curr.next = next;
        helper(curr.left , curr.right);
        helper(curr.right , (curr.next == null) ? null : curr.next.left);
        return ;
    }
    public Node connect(Node root) {
            helper(root, null);
            return root;
    }
}