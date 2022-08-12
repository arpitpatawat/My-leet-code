class Solution {
public List<List<Integer>> threeSum(int[] nums) {
// put all in map
List<List<Integer>> ans = new ArrayList<List<Integer>>();
int sum = 0;
for(int i = 0 ; i < nums.length; ++i){
sum = -nums[i];
HashMap<Integer, Integer> map = new HashMap<>();
for(int j = i+1; j < nums.length; ++j){
if(map.containsKey(sum - nums[j]))
{
List<Integer> temp = new ArrayList<>();
temp.add(nums[i]);
temp.add(nums[j]);
temp.add(nums[map.get(sum - nums[j])]);
ans.add(temp);
}
}
map.put(nums[i])
}
return ans;
}
}