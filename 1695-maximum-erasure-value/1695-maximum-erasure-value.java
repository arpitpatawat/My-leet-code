class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int arr[] = new int[nums.length+1];
        int sum = 0;
        // take left and right, left will point to starting of the subarr and right for traversal
        
        for(int l = 0 , r = 0 ; r< nums.length ; ++r){
            arr[r+1] = arr[r] + nums[r] ;  // prefix sum
            if(map.containsKey(nums[r])){
                l = Math.max(l,map.get(nums[r]) + 1); // if [5,2,2,5 then] we dont want l to point to the first occurence of 5
            }
            sum = Math.max(sum, arr[r+1] - arr[l]);
            map.put(nums[r] , r);
        }
        return sum;
        
    }
}