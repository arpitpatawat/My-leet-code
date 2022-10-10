
class Node{
    int val,data;
    Node next;
    Node prev;
    
    Node(int val, int data){
        this.val = val;
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class LRUCache {
        HashMap<Integer , Node> map;
     Node head,tail;
    int max;
    
    private Node deleteAndSet(Node h, Node t){
        h.next.prev = h.prev;
        h.prev.next = h.next;
        h.next = null;
        h.prev = null;
        
        
        t.next = head.next;
        t.prev = head;
        head.next = t;
        t.next.prev = t;
        
        return t;
    }
    
    private Node justSet(Node t){
        t.next = head.next;
        t.prev = head;
        head.next = t;
        t.next.prev = t;
        
        return t;
    }
    public LRUCache(int capacity) {
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        map = new HashMap<Integer , Node>(capacity);
        max = capacity;
    }
    
    public int get(int key) {
      if(map.containsKey(key)){
          // delete the node from its position
         // put the node closer to head
          // return the value from map
         map.put(key,deleteAndSet(map.get(key),map.get(key)));
         return map.get(key).data; 
          
      }  
    else{
        return -1;
    }
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
                map.get(key).data = value;
             map.put(key,deleteAndSet(map.get(key),map.get(key)));
            return ;
        }
        if(map.size() == max){
           map.remove(tail.prev.val);
          Node x = deleteAndSet(tail.prev , new Node(key,value));
             map.put(key, x);
           
        }
        else{
            Node x = justSet(new Node(key,value));
             map.put(key, x);
        }
           
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */