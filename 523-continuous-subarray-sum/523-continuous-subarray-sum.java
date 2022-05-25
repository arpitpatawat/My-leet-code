class Solution {
    public boolean checkSubarraySum(int[] a, int k) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      map.put(0,0);
      int sum = 0 , rem = 0;
    for(int i = 0 ; i < a.length; ++i){
        sum += a[i];
        rem = sum % k;
        if(rem < 0) rem +=k;
        if(map.containsKey(rem)){
            if(i+1-map.get(rem) > 1) return true;
            map.put(k+1,i+1);
            continue;
        }
        map.put(rem,1+i);
    }
        return false;
    }
}