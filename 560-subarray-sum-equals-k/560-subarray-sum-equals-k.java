// class Solution {
//     public int subarraySum(int[] a, int k) {
//          HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//         map.put(0,1);
//         int count = 0, sum = 0;
//         for(int i = 0; i < a.length ; ++i){
//             sum += a[i];
//             if(map.containsKey(sum-k)){
//                 count += map.get(sum-k);
//               // map.put(sum,count-1);
//                 // map.put(sum-k,map.get(sum-k)+1);
//             }
//             else map.put(sum,map.getOrDefault(sum,0) + 1);
//         }
//         return count;
//     }
// }

public class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, result = 0;
        Map<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (preSum.containsKey(sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        
        return result;
    }
}