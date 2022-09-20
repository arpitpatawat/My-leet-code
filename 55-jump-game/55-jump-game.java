class Solution {
    public boolean canJump(int[] nums) {
        int cf = 0;
        int ce = 0;
        for(int i = 0; i < nums.length ; ++i){
            if(i > cf){
                return false;
            }
            cf = Math.max(cf , nums[i] + i);
            
        }
        return true;
        
    }
}