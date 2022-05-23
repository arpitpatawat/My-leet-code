// class Solution {
//     public int maximumDifference(int[] nums) {
//       int mn = nums[0], res = -1;
//     for (int i = 1; i < nums.length; ++i) {
//         res = Math.max(res, nums[i] - mn);
//         mn = Math.min(mn, nums[i]);
//     }
//     return res == 0 ? -1 : res; 
//     }
// } 

class Solution {
    public int maximumDifference(int[] a) {
        int res = a[0], diff = -1;
        for(int i =1 ; i < a.length ; i++){
            System.out.println(diff);
                diff = Math.max(diff, a[i] - res);
                res = Math.min(res,a[i]);
        }
        return diff == 0 ? -1:diff;
    }
} 



