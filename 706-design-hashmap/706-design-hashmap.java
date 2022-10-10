class Node{
    int val1;
    int val2;
    Node next;
    public Node(int val1 , int val2){
        this.val1 = val1;
        this.val2 = val2;
        this.next = null;
    }
}
class MyHashMap {
   
    Node mainHead;
    public MyHashMap() {
   
        mainHead = null;
    }
    
    public void put(int key, int value) {
        if(mainHead == null){
            mainHead = new Node(key,value);
            return ;
        }
        Node head = mainHead;
        while(head.next != null && head.next.val1 <= key){
            head = head.next;
        }
        if(head.val1 == key){
            head.val2 = value;
        }
        else{
        Node temp = new Node(key,value);
        temp.next = head.next;
        head.next = temp;
        }
        return ;
    }
    
    public int get(int key) {
        Node head = mainHead;
        while(head != null){
            if(head.val1 == key){
                return head.val2;
            }
            else{
                head = head.next;
            }
        }
        return -1;
    }
    
    public void remove(int key) {
        if(mainHead == null ){
            return ;
        }
        if(mainHead.val1 == key){
            mainHead = mainHead.next;
            return ;
        }
        Node head = mainHead;
        while(head.next != null){
            if(head.next.val1 == key){
                head.next = head.next.next;
                return ;
            }
            head = head.next;
        }
        return ;
    }
}