class Solution {
    public int unequalTriplets(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0 ; i < n-2; ++i){
            for(int j = i+1 ; j < n-1; ++j){
                int k = n-1;
                while(k > j){
                    if(nums[i] != nums[j] && nums[j] != nums[k] && nums[i] != nums[k]){
                        ++ans;
                    }
                    --k;
                }
            }
        }
        return ans;
    }
}