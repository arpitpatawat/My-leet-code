class Solution {
    public boolean isSubsequence(String s, String t) {
        // if(s.length() == 0) return true;
        int i = 0; // t ke liye
        int j = 0; // s ke liye
        while(i < t.length() && j< s.length()){
            if(t.charAt(i) == s.charAt(j)){
                ++j;
            }
            ++i;
        }
        return (j==s.length());
    }
}