class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = prev;
    }
}
class MyCircularQueue {
    Node head,tail;
    int max,count;
    public MyCircularQueue(int k) {
        head = null;
        tail = null;
        max = k;
        count = 0;
    }
    
    public boolean enQueue(int value) {
        if(max == count){
            return false;
        }
        if(head == null){
            head = new Node(value);
            tail = head;
            head.next = tail;
            head.prev = tail;
        }else{
            Node temp = new Node(value);
            temp.next = head;
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
        }
        count++;
        return true;
    }
    
    public boolean deQueue() {
        if(head == null){
            return false;
        }
        if(count == 1){
            head = null;
            tail = null;
        }
        else{
        Node temp = head.next;
        tail.next = temp;
        temp.prev = tail;
        head.next = null;
        head = temp;
        }
        count--;
            
        return true;
        
    }
    
    public int Front() {
        if(head == null){
            return -1;
        }
        else{
            return head.data;
        }
    }
    
    public int Rear() {
         if(head == null){
            return -1;
        }
        else{
            return tail.data;
        }
    }
    
    public boolean isEmpty() {
            return (head == null);
    }
    
    public boolean isFull() {
        return (max == count);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */