class Node{
    String data;
    Node next;
    Node prev;
    public Node(String data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class BrowserHistory {
        Node curr;
    public BrowserHistory(String homepage) {
        Node home = new Node(homepage);
        curr = home;
    }
    
    public void visit(String url) {
        curr.next = new Node(url);
        curr.next.prev = curr;
        curr = curr.next;
        return ;
    }
    
    public String back(int steps) {
        for(int i = 0 ; i < steps && curr.prev != null ; ++i){
            curr = curr.prev;
        }
        return curr.data;
    }
    
    public String forward(int steps) {
         for(int i = 0 ; i < steps && curr.next != null ; ++i){
            curr = curr.next;
        }
        return curr.data;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */