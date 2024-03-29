
class Solution {
    public int maxJump(int[] stones) {
        int ans = stones[1] - stones[0], even = 0;
        for(int i = 2; i < stones.length; ++i){
            even = Math.max(even , stones[i] - stones[i-2]);
        }
        for(int i = 3 ; i < stones.length; ++i){
            even = Math.max(even , stones[i] - stones[i-2]);
        }
        return Math.max(ans , even);
    }
}