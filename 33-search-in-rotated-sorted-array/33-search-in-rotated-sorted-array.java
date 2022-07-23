class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target) return mid;
            // check left part is sorted 
            if(nums[mid] >= nums[low]){ // range (low , mid) 
                if(target <= nums[mid] && target >= nums[low]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
                
            } // right part is sorted 
            else {   //range is (mid , high)
                if(target >= nums[mid] && target <= nums[high]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            
        }
        // if i am here that means i could not find that element in the list 
        return -1;
    }
}