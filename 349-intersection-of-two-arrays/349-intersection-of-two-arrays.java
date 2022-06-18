class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k = 0;
        int op[] = new int[Math.min(nums1.length, nums2.length)];
        while(i< nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]) {
                if(k == 0 || nums1[i] != op[k-1]) {
                    op[k] = nums1[i]; 
                // System.out.println(nums1[i] +"," + nums2[j] +"," + k +"," + op[k]);
                    ++k;}
                ++i;
                ++j;
            }
            else if(nums1[i] > nums2[j]) ++j;
            else ++i;    
        }
        int alpa[] = new int[k];
        for(int a = 0 ; a < k; ++a){
            alpa[a] = op[a];
        }
        return alpa;
    }
}