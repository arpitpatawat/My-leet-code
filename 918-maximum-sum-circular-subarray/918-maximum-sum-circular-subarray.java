// class Solution {
//     public int normalsum(int arr[],int n){
//         int res = arr[0], max = arr[0];
//         for(int i = 1 ; i < n ; i++){
//             max = Math.max(arr[i], arr[i] + max);
//             res = Math.max(res, max);
//         }
//         return res;
//     }
//     public int maxSubarraySumCircular(int[] nums) {
//          int kadane = normalsum(nums,nums.length);
//         if(kadane < 0) return kadane;
//         int arrsum = 0;
//         for(int i = 0 ; i < nums.length ; i++){
//             arrsum += nums[i];
//             nums[i] = -nums[i];
//         }
//         int cirsum =arrsum + normalsum(nums, nums.length);
//         System.out.println(kadane +"," + cirsum);
//         return Math.max(kadane,cirsum);
//     }
// }
class Solution{
  public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}