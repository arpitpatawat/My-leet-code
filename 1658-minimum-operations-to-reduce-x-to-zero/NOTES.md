​
public int minOperations(int[] nums, int x) {
//
if(nums.length == 1 && nums[0] != x){
return -1;
}
int arrsum = 0;
for(int i = 0 ; i < nums.length ; ++i){
arrsum += nums[i];
}
// pre-processing
if(arrsum < x) return -1;
else if(arrsum == x) return nums.length;
int left = 0;
int right = 0;
int currsum = 0;
int maxsum = Integer.MAX_VALUE;
//nums[right] - nums[left] != arrsum - x
while(right<nums.length){
currsum += nums[right] ;
while(currsum > arrsum - x && left < right){
currsum -= nums[left];
++left;
}