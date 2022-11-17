/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public  class Pair {
        int val;
        int idx;
        Pair(int val, int idx)
        {
            this.val = val;
            this.idx = idx;
        }
    }
class Solution {
    
   public int minSwaps(int[] arr)
    {
        int N = arr.length;
        int ans = 0;
        int[] temp = Arrays.copyOfRange(arr, 0, N);
 
        // Hashmap which stores the
        // indexes of the input array
        HashMap<Integer, Integer> h
            = new HashMap<Integer, Integer>();
 
        Arrays.sort(temp);
        for (int i = 0; i < N; i++)
        {
            h.put(arr[i], i);
        }
        for (int i = 0; i < N; i++)
        {
 
            // This is checking whether
            // the current element is
            // at the right place or not
            if (arr[i] != temp[i])
            {
                ans++;
                int init = arr[i];
 
                // If not, swap this element
                // with the index of the
                // element which should come here
                swap(arr, i, h.get(temp[i]));
 
                // Update the indexes in
                // the hashmap accordingly
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return ans;
    }
    public void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int ans = 0;
        while(q.size() > 0){
            int size = q.size();
            int temp[] = new int[size];
            for(int i = 0 ; i < size; ++i){
                TreeNode aaa = q.poll();
                temp[i] = aaa.val;
                if(aaa.left != null){
                    q.offer(aaa.left);
                }
                if(aaa.right != null){
                    q.offer(aaa.right);
                }
            }
            // System.out.println(minOperations(temp));
        ans += minSwaps(temp);
        }
        return ans;
    }
}