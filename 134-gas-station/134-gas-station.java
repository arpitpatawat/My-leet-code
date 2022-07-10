class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int kami = 0;
        int bal = 0;
        
        for(int i = 0; i < gas.length; ++i){
            bal += gas[i] - cost[i];
           
            if(bal < 0){
                kami += bal;
                bal = 0; // fresh start
                start = i+1;
            }
        }
        
        if(bal + kami >= 0) return start;
        else return -1;
    }
}