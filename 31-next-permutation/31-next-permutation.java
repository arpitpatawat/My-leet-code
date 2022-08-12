class Solution {
    public void swap(int low, int high, int nums[]){
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
    
    public void reverse(int k , int nums[]){
        int low = k+1;
        int high = nums.length - 1;
        while(low < high){
            swap(low, high, nums);
            low++;
            high--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        int low = -1;
        for(int i = nums.length - 2 ; i >= 0; --i){
            if(nums[i] < nums[i + 1]){
                low = i;
                break;
            }
        }
        if(low == -1){
            reverse(low , nums);
            return ;
        }
        int high = nums[nums.length - 1];
        for(int i = nums.length - 1; i >= 0 ; --i){
            if(nums[i] > nums[low]){
                high = i;
                break;
            }
        }
        // System.out.println(nums[low] + "," + nums[high]);
        swap(low, high, nums);
        reverse(low, nums);
        
    }
}