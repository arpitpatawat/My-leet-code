class Solution {
    public boolean hasAllCodes(String s, int k) {
        
        int arr[] = new int[(int)Math.pow(2,k)];
        Arrays.fill(arr,-1);
       for(int i = 0 ; i < s.length() - k +1; ++i){
            String sub = s.substring(i,i+k);
            int value = Integer.parseInt(sub,2);  
            arr[value] = i;
        }
        for(int i = 0 ; i < arr.length ; ++i){
            if(arr[i] == -1) return false;
        }
        return true; //(map.size() == Math.pow(2,k));
    }
}