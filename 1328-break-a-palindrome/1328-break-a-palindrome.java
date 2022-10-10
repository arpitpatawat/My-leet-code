class Solution {
    public String breakPalindrome(String p) {
        if(p.length() == 1){
            String ans = "";
            return ans;
        }
        char arr[] = p.toCharArray();
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] != 'a'){
                arr[i] = 'a';
                break;
            }
        }
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] != 'a'){
                return new String(arr);
            }
        }
        arr = p.toCharArray();
        arr[arr.length - 1] = 'b';
        return new String(arr);
    }
}