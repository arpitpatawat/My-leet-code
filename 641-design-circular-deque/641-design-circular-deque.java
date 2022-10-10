class Node{
    int val;
    Node next;
    Node prev;
    
    public Node(int val){
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}
class MyCircularDeque {
        Node head,tail;
        int max,count;
    public MyCircularDeque(int k) {
        head = null;
        tail = head;
        max = k;
        count = 0;
    }
    
    public boolean insertFront(int value) {
        if(count == max){
            return false;
        }
        if(head == null){
            head = new Node(value);
            tail = head;
            count++;
        }
        else{
            Node temp = new Node(value);
            temp.next = head;
            temp.prev = tail;
            tail.next = temp;
            head.prev = temp;
            head = temp;
            count++;
        }
        return true;
    }
    
    public boolean insertLast(int value) {
        if(count == max){
            return false;
        }
        if(head == null){
            head = new Node(value);
            tail = head;
            count++;
        }
        else{
            Node temp = new Node(value);
            temp.next = head;
            temp.prev = tail;
            tail.next = temp;
            head.prev = temp;
            tail = temp;
            count++;
        }
        return true;
    }
    
    public boolean deleteFront() {
        if(head == null){
            return false;
        }
        if(head == tail){ // 1 node
            head = null;
            tail = null;
            count--;
        }
        else{
            tail.next = head.next;
            head.next.prev = tail;
            head = head.next;
            count--;
        }
        return true;
    }
    
    public boolean deleteLast() {
        if(head == null){ // 0 node
            return false;
        }
        if(head == tail){ // 1 node
            head = null;
            tail = null;
            count--;
        }
        else{
            head.prev = tail.prev;
            tail.prev.next = head;
            tail = tail.prev;
            count--;
        }
        return true;
    }
    
    public int getFront() {
        if(head == null){
            return -1;
        }
        else{
            return head.val;
        }
    }
    
    public int getRear() {
        if(head == null){
            return -1;
        }
        else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        if(head == null){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull() {
        if(count == max){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */