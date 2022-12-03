
class Solution {
    public String frequencySort(String s) {
        int ans[][] = new int[26*2+10][2];
        for(int i = 0 ; i < s.length() ; ++i){
            int val = (int) s.charAt(i);
            if(val <= '9' && val >='0'){
                int x = val - '0';
                ans[x + 52][0] = val;
                ans[x + 52][1]++; 
            }
            else if(val <= 'z' && val >= 'a'){
            int x = val - 'a';
                ans[x][0] = val;
                ans[x][1]++; 
            }
            else{
            int x = val - 'A';
              ans[x + 26][0] = val;
                ans[x + 26][1]++; 
            }
        }
        
        Arrays.sort(ans , (a,b) -> ( b[1] - a[1]));
//         for(int i[] : ans){
//             System.out.println(Arrays.toString(i));
            
//         }
        
        String temp = "";
        for(int i[] : ans){
            int val = i[1];
            if(val == 0) break;
            while(val != 0){
                 temp = temp + (char)i[0];
                      --val;
            }
           
        }
        return temp;
    }
}