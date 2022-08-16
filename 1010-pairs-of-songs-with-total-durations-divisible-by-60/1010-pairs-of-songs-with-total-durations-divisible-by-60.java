class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer , Integer> map = new HashMap<>();
        // map.put(0,1);
        int sum = 0;
        for(int i = 0 ; i < time.length ; ++i){
            int k = time[i] % 60;
            int p = (60 - k) % 60;
            if(map.containsKey(p)){
                sum += map.get(p);
            }
            
            map.put(k , map.getOrDefault(k , 0) + 1);
            
            
        }
        
        return sum;
    }
}