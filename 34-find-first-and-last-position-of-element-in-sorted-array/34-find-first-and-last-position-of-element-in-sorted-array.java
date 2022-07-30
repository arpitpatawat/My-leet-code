class Solution {
    public int binarySearch1(int nums[] , int target){
        int idx = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) idx = mid;
            if(nums[mid] < target){
                low = mid + 1;
                
            }
            else{
                high = mid - 1;
            }
        }
        return idx;
        
    }
    public int binarySearch2(int nums[] , int target){
        int idx = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) idx = mid;
            if(nums[mid] > target){
                high = mid - 1;
                
            }
            else{
                low = mid + 1;
            }
        }
        return idx;
        
    }
    public int[] searchRange(int[] nums, int target) {
        // if(nums.length == 0) return new int[]{-1 , -1};
        // 1st ka low and 2nd ka high output dega 
        // int low = -1
        int low = binarySearch1(nums, target);
        int high = binarySearch2(nums , target );
        return new int []{low ,high};
    }
}