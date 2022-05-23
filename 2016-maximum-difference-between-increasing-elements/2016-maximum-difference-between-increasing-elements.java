class Solution {
    public int maximumDifference(int[] nums) {
      int mn = nums[0], res = -1;
    for (int i = 1; i < nums.length; ++i) {
        res = Math.max(res, nums[i] - mn);
        mn = Math.min(mn, nums[i]);
    }
    return res == 0 ? -1 : res; 
    }
} 




// int res = 0, diff = -1;
//         for(int i =1 ; i < a.length ; i++){
//             if(a[i] > a[res]){
//                 diff = Math.max(diff, a[i] - a[res]);
//             }
//             else 
//                 res = i;
//         }
//         return diff;