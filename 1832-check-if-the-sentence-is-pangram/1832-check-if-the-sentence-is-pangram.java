class Solution {
    public boolean checkIfPangram(String s) {
            char temp[] = new char[26];
        for(int i = 0 ; i < s.length() ; ++i){
            temp[s.charAt(i) - 'a']++;
        }
        
        for(int i = 0 ; i < 26 ; ++i){
            if(temp[i] == 0){
                return false;
            }
        }
        return true;
    }
}