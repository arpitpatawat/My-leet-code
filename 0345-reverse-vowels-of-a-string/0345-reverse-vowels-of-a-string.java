class Solution {
    public String reverseVowels(String s) {
        char temp[] = s.toCharArray();
        int i = 0;
        int j = temp.length - 1;
        Set<Character> set = new HashSet<>();

        set.add('a');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('e');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        while(i < j){
            while(i < j && !set.contains(temp[i])){
                ++i;
            } 
            while(i < j && !set.contains(temp[j]) ){
                --j;
            }
            char tempchar = temp[i];
            temp[i] = temp[j];
            temp[j] = tempchar;
            ++i; --j;
        }
        
        return new String(temp);
    }
}