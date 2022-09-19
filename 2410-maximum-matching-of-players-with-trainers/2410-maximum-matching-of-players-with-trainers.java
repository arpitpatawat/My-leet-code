class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        
        int ans = 0;
        int k = 0;
        for(int i = 0 ; i < players.length; ++i){
            while(k < trainers.length){
                
            
                
                if(trainers[k] >= players[i]){
                    ans ++;
                    // trainers[k] =-1;
                    k = k+1;
                    break;
                }
                k++;
            }
        }
        return ans;
        
    }
}