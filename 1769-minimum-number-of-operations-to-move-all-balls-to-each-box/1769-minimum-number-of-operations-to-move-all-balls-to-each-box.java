class Solution {
    public int[] minOperations(String boxes) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i < boxes.length() ; ++i){
            if(boxes.charAt(i) == '1'){
                set.add(i);
            }
        }
        int ans[] = new int[boxes.length()];
        for(int i = 0 ; i <boxes.length() ; ++i ){
            int sum = 0;
            Iterator<Integer> it = set.iterator();
            while(it.hasNext()){
                    sum += Math.abs(it.next() - i);                
            }
            ans[i] = sum;
        }
        return ans;
    }
}