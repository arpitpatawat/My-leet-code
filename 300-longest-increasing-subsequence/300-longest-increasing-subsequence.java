class Solution {
    private int binarysearch(int helper[], int low, int high, int ref){
        while(low < high){
            int mid = low + (high - low) / 2;
            if(helper[mid] >= ref){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return high;
    }
    public int lengthOfLIS(int[] nums) {
       int helper[] = new int[nums.length];
       int len = 1;
       helper[0] = nums[0];
       for(int i = 1 ; i < nums.length; ++i){
           if(nums[i] > helper[len - 1]){
               helper[len] = nums[i];
               ++len;;
           }
           else{
               int x = binarysearch(helper, 0, len - 1, nums[i]);
               helper[x] = nums[i];
           }
       }
    return len;
    }
}