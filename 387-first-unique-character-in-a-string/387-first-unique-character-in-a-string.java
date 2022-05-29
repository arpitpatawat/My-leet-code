class Solution {
    public int firstUniqChar(String s) {
        int arr[] = new int[26];
        Arrays.fill(arr, -1);
        for(int i = 0 ; i < s.length() ; ++i){
          if(arr[s.charAt(i) - 'a'] == -1){
              arr[s.charAt(i) - 'a'] = i;
          }
            else
                arr[s.charAt(i) - 'a'] = -2;
        }
        int res = Integer.MAX_VALUE;
        for(int i = 0 ; i < 26 ; ++i){
            if(arr[i] >= 0){
            res = Math.min(res, arr[i]);
            }
        }
        return (res==Integer.MAX_VALUE) ? -1:res;
    }
}