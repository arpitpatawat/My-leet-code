class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = profit.length;
        int jobs[][] = new int[n][3];
        for(int i = 0 ; i < n ; ++i){
            jobs[i] = new int[]{startTime[i], endTime[i] , profit[i]};
        }
        // converted all 3 arrays to a single 2d array of n X 3 dimension.
        
        Arrays.sort(jobs, (a,b) -> a[1] - b[1]);
        // sorted them on the basis of end time 
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0,0);
        for(int i = 0 ; i < n; ++i){
            int start = jobs[i][0];
            int end = jobs[i][1];
            int dist = jobs[i][2];
            
            int lesser_value = map.floorEntry(start).getValue();
            int temp = lesser_value + dist;
            if(map.get(map.lastKey()) < temp){
                map.put(end , temp);
            }
            
        }
        
        return map.get(map.lastKey());
    
    }
}