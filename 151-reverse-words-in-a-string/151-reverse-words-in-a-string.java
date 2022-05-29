class Solution {
    public String reverse(String a, int low, int high){
            char[] s= a.toCharArray();
            while(low < high){
                char temp = s[low];
                s[low] = s[high];
                s[high] = temp;
                ++low; 
                --high;
            }
        return new String(s);
    }
    public String reverseWords(String s) {
        s = s.trim().replaceAll(" +"," "); // this will replace all the multiple white space in between and initial and after spaces of the string
        int low = 0;
       for(int i = 0 ; i < s.length() -1 ; ++i){
           if(s.charAt(i) == ' '){
              s = reverse(s,low , i -1);
               low = i+1;
               
           }
       } 
        s=reverse(s,low , s.length() -1);
        return reverse(s,0,s.length() -1);
    }
}
