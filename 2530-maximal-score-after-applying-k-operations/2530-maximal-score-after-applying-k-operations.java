class Solution {
    public void reverse(int []nums){
        int low = 0;
        int high = nums.length - 1;
        while(low < high){
            int temp  = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            ++low;
            --high;
        }
        return ; 
    }
    public long maxKelements(int[] nums, int k) {
        long ans = 0;
        PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
        for(int i : nums) pq.offer((long) i);
        
        while(k > 0){
            long temp = pq.poll();
            ans += temp;
            temp = (temp + 2 )/ 3;
            pq.offer(temp);
            --k;
        }
        return ans;
    }
}