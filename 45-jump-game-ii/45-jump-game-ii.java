class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int n = nums.length;
        int currentfarthest = 0;
        int currentend = 0;
        for(int i = 0; i < n - 1; ++i){
            currentfarthest = Math.max(currentfarthest, i + nums[i]);
            
            if(i == currentend){
                jumps++;
                currentend = currentfarthest;
            }
        }
        return jumps;
    }
}