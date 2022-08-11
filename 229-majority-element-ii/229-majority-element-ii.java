class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 = nums[0];
        int count1 = 1;
        int maj2 = -1;
        int count2 = 0;
        for(int i = 1; i < nums.length ; ++i){
            if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i] == maj2){
                count2++;
            } 
            else{
                if(count1 == 0){
                    count1 = 1;
                    maj1 = nums[i];
                }
                else if(count2 == 0){
                    count2= 1;
                    maj2 = nums[i];
                }
                else{
                    count1--;
                    count2--;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int i = 0; i < nums.length; ++i){
            if(nums[i] == maj1){
                count1++;
            }
            else if(nums[i] == maj2){
                count2++;
            }
        }
        if(count1 > nums.length / 3){
            ans.add(maj1);
        }
        if(count2 > nums.length /3){
            ans.add(maj2);
        }
        return ans;
        
    }
}