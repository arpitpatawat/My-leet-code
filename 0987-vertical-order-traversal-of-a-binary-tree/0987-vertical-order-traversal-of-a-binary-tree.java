class Solution {
    Map<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new HashMap<>();
    int min = 0, max = 0;
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        helper(root, 0, 0);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = min; i <= max; ++i) {
            List<Integer> level = new ArrayList<Integer>();
            for (int key : map.get(i).keySet()) {
                while (!(map.get(i).get(key)).isEmpty()) {
                    level.add(map.get(i).get(key).poll());
                }
            }
            ans.add(level);
        }
        return ans;
        
    }
    
    private void helper(TreeNode node, int col, int row) {
        if (node == null) return;
        min = Math.min(min, col);
        max = Math.max(max, col);
        if (map.get(col) == null) { map.put(col, new TreeMap<Integer, PriorityQueue<Integer>>()); }
        if (map.get(col).get(row) == null) { map.get(col).put(row, new PriorityQueue<Integer>()); }
        map.get(col).get(row).add(node.val);
        helper(node.left, col - 1, row + 1);
        helper(node.right, col + 1, row + 1);   

    }
}