class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(trainers);
        Arrays.sort(players);
        // HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        int k = 0;
        for(int i = 0 ; i < players.length; ++i){
            for(int j = k ; j < trainers.length; ++j){
                
                if(trainers[j] >= players[i]){
                    ans ++;
                    trainers[j] =-1;
                    k = j+1;
                    break;
                }
            }
        }
        return ans;
        
    }
}