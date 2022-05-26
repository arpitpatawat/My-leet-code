class Solution {
    public int subarraySum(int[] a, int k) {
         HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0,1);
        int count = 0, sum = 0;
        for(int i = 0; i < a.length ; ++i){
            sum += a[i];
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
             map.put(sum,map.getOrDefault(sum,0) + 1);
        }
        return count;
    }
}
