class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int startPoint = 0;
        int curr_gas = 0;
        int defi = 0;
        int n = gas.length;
        for(int i = 0 ; i < n ; ++i){
            curr_gas += gas[i] - cost[i];
            if(curr_gas < 0){
                startPoint = i+1;
                defi += curr_gas;
                curr_gas = 0;
            }
        }
        defi *= -1;
        if(startPoint == n || curr_gas < defi) return -1;
        return startPoint;
    }
}