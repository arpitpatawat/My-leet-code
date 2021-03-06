class Solution {
    public int subarraysDivByK(int[] a, int k) {
        int count = 0;
        int sum = 0 , rem = 0;
        int arr[] = new int[k];
        arr[0] = 1;
        for(int i = 0 ; i < a.length ; ++i){
            sum += a[i];
            rem = sum % k;
            if(rem < 0) rem += k;
            count += arr[rem];
            arr[rem]++;
        }
        return count;
    }
}


/*HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        int sum = 0 ;
        int rem = 0;
        map.put(0,1);
        for(int i = 0 ; i < a.length ; ++i){
            sum += a[i];
            rem = sum % k;
            if(rem < 0) rem  += k;
            if(map.containsKey(rem)){
              count += map.get(rem);
              map.put(rem, map.get(rem)+1);  
            }
            else{
                map.put(rem,1);
            }
        }
        return count; */