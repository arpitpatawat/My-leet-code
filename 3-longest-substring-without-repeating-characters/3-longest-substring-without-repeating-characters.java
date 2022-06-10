class Solution {
    public int lengthOfLongestSubstring(String s) {
	int longest = 0; //keep track of the longest substring
	int[] arr = new int[128];  //array of size 128
     //l and r are left and right pointer
	for (int r=0, l = 0; r<s.length(); ++r) {
		l = Math.max(arr[s.charAt(r)], l); 
		longest = Math.max(longest, r - l + 1);
		arr[s.charAt(r)] = r + 1;
	}

	return longest;
}
}