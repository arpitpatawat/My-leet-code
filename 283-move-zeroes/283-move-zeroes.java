class Solution {
    public void moveZeroes(int[] nums) {
        // int res = 0 , temp = 0;
        // for(int i = 0 ; i < a.length ; ++i){
        //     if(a[i] != 0){
        //         temp = a[res];
        //         a[res] = a[i];
        //         a[i] = temp;
        //         res ++;
        //     }
        // }
        
        int j = 0;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] != 0) {
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
            j++;
        }

    }
}
}