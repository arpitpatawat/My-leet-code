class Solution {
   public int removeDuplicates(int[] nums) {
    int i = 0;
    // for (int n : nums)
    //     if (i == 0 || n > nums[i-1])
    //         nums[i++] = n;
    // return i;
       for(int j=1;j<nums.length ; j++){
           if(nums[j] != nums[i]){
               i++;
               nums[i] = nums[j];
           }
       }
       return i+1;
}
}