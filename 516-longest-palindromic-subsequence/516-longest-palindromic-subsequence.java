class Solution {
    public String reverseString(String s){
        char arr[] = s.toCharArray();
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            
            low++;
            high--;
        }
        
        return new String(arr);
          
    }
    
    public int longestPalindromeSubseq(String s) {
      String s2 = reverseString(s);
        int m = s.length();

        
        int helper[][] = new int[m + 1][m + 1];
        
        // filling the first column 
        for(int i = 0 ; i < m + 1 ; ++i){
            helper[i][0] = 0;
            helper[0][i] = 0;
        }
        
     
        
        for(int i = 1; i < m + 1 ; ++i){
            for(int j = 1; j < m + 1 ; ++j){
                if(s.charAt(i - 1) == s2.charAt(j - 1)){
                    helper[i][j] = 1 + helper[i-1][j-1];
                }
                else{
                    helper[i][j] = Math.max(helper[i-1][j] ,helper[i][j-1]);
                }
            }
        }
        
        return helper[m][m];
    }
}