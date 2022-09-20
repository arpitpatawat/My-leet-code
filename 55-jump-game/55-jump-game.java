class Solution {
    public boolean canJump(int[] nums) {
        int cf = 0;
        int n = nums.length;
        for(int i = 0; i <= cf && i < n ; ++i){
            
            cf = Math.max(cf , nums[i] + i);
            
        }
        if(cf >= nums.length - 1) return true;
        else 
            return false;
        
    }
}