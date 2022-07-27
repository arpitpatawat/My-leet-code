class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
     int ans[] = new int[n];
     // first pass to find all the indexes to reach 0's and total 1 ;
     int count = 0;
     int index = 0;
        for(int i = 0 ; i < n ; ++i ){
            if(boxes.charAt(i) == '1'){
                ++count;
                index += i;
            }
        }
        ans[0] = index;
        
        int fcount = 0;
        if(boxes.charAt(0) == '1'){
            count--;
            fcount++;
        }
        for(int i = 1 ; i < n ; ++i){
            ans[i] = ans[i-1] - count + fcount;
            if(boxes.charAt(i) == '1'){
            count--;
            fcount++;
        }
        }
        return ans;
    }
}