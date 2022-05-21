class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int res = 0, count = 0, i = 0;
        for(i= 0 ; i < nums.length ; i ++ ){
            if(nums[i] != 1 ){
                count = Math.max(count, i-res);
                res= i+1;
            }
        }
        if(nums[nums.length-1] == 1) return  Math.max(count, i-res);
        return count;
    }
}