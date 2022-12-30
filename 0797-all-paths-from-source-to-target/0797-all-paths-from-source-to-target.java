/*
-> i will follow basic DFS approach
-> from node 0, i will call a dfs fxn, and will use a 'temp' list and 'ans' list of list
-> for every node i will visit , i will add it to the temp and recursively call for the all adj node
-> if curr node is n - 1 node, then add temp to ans and simply return ( void fxn)
-> that's it.

*/
class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
      int n = graph.length;
      int start = 0;
      int end = n - 1;
      List<List<Integer>> ans = new ArrayList<>();
      List<Integer> temp = new ArrayList<>();
      dfs(start , end , temp , ans , graph);
      return ans;  
    }
    
    private void dfs(int node , int end, List<Integer> temp , List<List<Integer>> ans, int [][] graph){
        temp.add(node);
        if(node == end){
            ans.add(new ArrayList<Integer>(temp));
            temp.remove(temp.size() - 1);
            return ;
        }
        
        for(int i : graph[node]){
            dfs(i, end, temp, ans , graph);
        }
        
        temp.remove(temp.size() - 1);
        return ;
    }
}