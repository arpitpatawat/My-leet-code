class Solution {
    public int findDuplicate(int[] nums) {
        int slow = nums[0]; //1
        int fast = nums[0]; //1
        do{
            slow = nums[slow] ; //3
            fast = nums[nums[fast]]; //2
        }
        while(
            slow != fast
        );
        
        // now they collide
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
        
    }
}