class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 0;
        for(int i = 1; i < nums.length ; ++i){
            if(nums[i] != nums[res]){
                ++res;
                int temp = nums[res];
                nums[res] = nums[i];
                nums[i] = temp;
            }
        }
        return res + 1;
    }
}