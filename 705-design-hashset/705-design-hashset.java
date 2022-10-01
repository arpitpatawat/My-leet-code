class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
        this.next = null;
    }
}

class MyHashSet {
 
      ListNode head;
      public MyHashSet() {
        head = new ListNode(-1);
    }
    
    public void add(int key) {
        ListNode prev = head;
        ListNode curr = head.next;
        if(curr == null){
            head.next = new ListNode(key);
            return ;
        }
        while(curr != null ){
            if(curr.val == key){
                return;
            }
            else if(curr.val < key){
                curr = curr.next;
                prev = prev.next;
            }
            else{
                ListNode temp = new ListNode(key);
                prev.next = temp;
                temp.next = curr;
                return ;
            }
        }
        
        prev.next = new ListNode(key);
        return ;
    }
    
    public void remove(int key) {
        ListNode prev = head;
        ListNode curr = head.next;
        while(curr != null){
            if(curr.val == key){
                prev.next = curr.next;
                return ;
            }
            else if(curr.val < key){
                prev = curr;
                curr = curr.next;
            }
            else {
                return ;
            }
        }
        return ;
    }
    
    public boolean contains(int key) {
        ListNode temp = head;
        while(temp != null){
            if(temp.val == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */