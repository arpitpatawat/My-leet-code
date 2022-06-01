class Solution {
    private boolean check(String s, int low, int high){
        while(low<high){
            if(s.charAt(low) != s.charAt(high)){
                return false;
            }
            --high;
            ++low;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int low = 0;
        int high = s.length() - 1;
        while(low < high){
            if(s.charAt(low) != s.charAt(high)){
                return (check(s,low+1,high) || check(s,low,high-1));
            }
            --high;
            ++low;
        }
        return true;
    }
}