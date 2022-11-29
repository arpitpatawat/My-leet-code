class Solution {
    List<String> ans;
    private void helper(int index, char temp[] , String digits, char arr[][]){
        if(index == digits.length()){
            ans.add(new String(temp));
            return ;
        }
        int curr_digit = digits.charAt(index) - '0';
        int arr_index = curr_digit - 2;
        // for(int i = 0 ; i < arr[arr_index].length ; ++i)
        for(char ch : arr[arr_index]){
            temp[index] = ch;
            helper(index + 1, temp, digits, arr);
        }
        return ;
        
    }
    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if(digits.length() == 0) return ans;
        char arr[][] = {{'a','b','c'},
                   {'d','e','f'},
                   {'g','h','i'},
                   {'j','k','l'},
                   {'m','n','o'},
                   {'p','q','r', 's'},
                   {'t','u','v'},
                   {'w','x','y', 'z'}};
        
        int len = digits.length();
        char temp[] = new char[len];
        helper(0, temp, digits, arr);
        return ans;
    }
}