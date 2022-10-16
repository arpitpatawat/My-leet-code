class Solution {
    public int findMaxK(int[] nums) {
        int temp[] = new int[2001];
        int ans = -1;
        for(int i : nums){
            temp[i+1000] = 1;
            if(temp[i+1000] != 0 && temp[-i+1000] !=0){
                ans = Math.max(ans , Math.abs(i));
            }
        }
        return ans;
    }
}