class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int[] map = new int[K];
		map[0] = 1;
        int count = 0, sum = 0;
        for(int a : A) {
            sum = (sum + a) % K;
            if(sum < 0) sum += K;  // Because -1 % 5 = -1, but we need the positive mod 4
            count += map[sum];
            map[sum]++;
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