class Solution {
    public int[] twoSum(int[] a, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int nums[] = new int[2];
        for(int i = 0 ; i < a.length ; ++i){
            if(map.containsKey(target- a[i])){   //7 ko search
                nums[0] = i;
                nums[1] = map.get(target- a[i]);
                return nums;
            }
            else {
                map.put(a[i],i);
            }
        }
        return nums;
    }
}