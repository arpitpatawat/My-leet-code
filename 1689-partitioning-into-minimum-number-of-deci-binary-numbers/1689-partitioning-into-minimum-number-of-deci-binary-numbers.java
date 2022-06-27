class Solution {
    public int minPartitions(String n) {
        int max = 0;
        for(int i = 0 ; i < n.length() ; ++i){
            max = Math.max(max, (int) n.charAt(i) - '0');
            if(max == 9) return 9;
        }
        return max;
    }
}