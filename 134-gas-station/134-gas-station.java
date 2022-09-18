class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
      int currentgas = 0;
      int def = 0;
      int startpoint = 0;
        for(int i = 0; i < gas.length; ++i){
            currentgas += gas[i] - cost[i];
            if(currentgas <0){
                def += currentgas;
                currentgas = 0;
                startpoint = i + 1;
            }
            
        }
        // .println(currentgas);
        //         System.out.prinSystem.outtln(def);

        if(currentgas + def >= 0){
            return startpoint;
        }
        else{
            return -1;
        }
    }
}