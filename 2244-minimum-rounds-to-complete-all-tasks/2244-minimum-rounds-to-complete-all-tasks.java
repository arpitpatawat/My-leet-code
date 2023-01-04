/*
Freq - 3 possible cases - 
a) freq = 3k , ans -> k
b) freq = 3k+1, ans -> 2 + 2 + 3*(k-1) => 1 + 1 + k-1 => k+1
c) freq = 3k+2, ans -> 2 + 3*k => 1+ k => k+1

=> if the freq is multiple of 3 then ans is k else k+1

*/
class Solution {
    public int minimumRounds(int[] tasks) {
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tasks){
            map.put(i , map.getOrDefault(i, 0) + 1);
        }
        
        for(int i : map.values()){
            if(i == 1) return -1;
            int freq = (i % 3 == 0) ? i/3 : i/3  + 1;
            ans += freq;
        }
        return ans;
    }
}