class Solution {
    private int helper(int job[] , int d , int index, Integer dp[][]){
        if(d == 0){
            int max = job[index];
            for(int i = index ; i < job.length ; ++i){
                max = Math.max(max , job[i]);
            }
            return max;
        }
        if(dp[d][index] == null){
            
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i = index  ; i < job.length - d ; ++i){
            max = Math.max(max , job[i]);
            min = Math.min(min , max + helper(job , d-1 , i+1,dp));
        }
        dp[d][index]  = min;
        }
        
        return dp[d][index];
    }
    public int minDifficulty(int[] job, int d) {
        if(job.length < d){
            return -1;
        }
        Integer dp[][] = new Integer[d][job.length];
        
        return helper(job, d-1 , 0,dp);
    }
}