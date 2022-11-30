class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer , Integer > map = new HashMap<>();
        Set<Integer> occur = new HashSet<>();
        for(int i : arr){
            map.put(i , map.getOrDefault(i,0) + 1);
        }
        
        for(var entry : map.entrySet()){
            if(!occur.add(entry.getValue())){
                return false;
            }
        }
        return true;
    }
}

