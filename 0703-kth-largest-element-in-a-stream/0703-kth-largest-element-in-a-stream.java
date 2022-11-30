class KthLargest {
    PriorityQueue<Integer> pq;
    int val;
    
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        val = k;
        for(int i : nums){
            add(i);
        }
        
    }
    
    public int add(int num) {
        if(pq.size() < val){
            pq.offer(num);
        }
        else if(pq.peek() < num){
            pq.poll();
            pq.offer(num);
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */