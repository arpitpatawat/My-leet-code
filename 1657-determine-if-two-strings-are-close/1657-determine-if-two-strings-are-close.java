class Solution {
    /* logic
    1) freq of all letters in word1 , should be same in word2 . Note: order doesn't matter
    -> "abc" freq of all char = 1 and "bca" freq of all char = 1
    -> "cabbba" freq are {2,3,1} and "abbccc" freq are {1,2,3}"
    
    2) char in word1 == char in word2 . eg "abc" and "def" with freq 1 for all but there are not close
    -> if freq of a char in word1 is something then freq of same char in word1 must not be 0.
    
    3) to check for freq -> i know that each freq in word1 has a duplicate freq in word 2. so 
       using XOR operation to cancel out each duplicate, return (ans == 0)
    
    
    
    */
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()){
            return false;
        }
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        
        for(int i = 0 ; i < word1.length() ; ++i){
            char c1 = word1.charAt(i);
            char c2 = word2.charAt(i);
            freq1[c1 - 'a']++;
            freq2[c2 - 'a']++;
        }
        int ans = 0;
        for(int i = 0 ; i < 26; ++i){
            if((freq1[i] > 0 && freq2[i] == 0 ) || (freq1[i] == 0 && freq2[i] > 0)){
                return false;
            }
           
        }
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        for(int i = 0 ; i < 26; ++i){
            if(freq1[i] != freq2[i]) return false;
           
        }
        
        return true;

    }
}