class Solution {
    public boolean dfs(int node, boolean[] path, boolean[] vis,  Set<Integer> set, int[][] graph ){
        if(set.contains(node)){
            return true;
        }
        else if(vis[node]){
            if(path[node]){
                return false;
            }
            else{
                return true;
            }
        }
        
        // base case ended
        vis[node] = true;
        path[node] = true;
        for(int i : graph[node]){
            if(!dfs(i, path, vis, set, graph)){
                return false;
            }
        }
        set.add(node);
        path[node] = false;
        return true;
        
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        boolean path[] = new boolean[graph.length];
        boolean visited[] = new boolean[graph.length];
        Set<Integer> set = new TreeSet<>();
        
        for(int i = 0 ; i < graph.length; ++i){
            if(!visited[i]){
                dfs(i, path, visited, set, graph);
            }
        }
        
        Iterator<Integer> it = set.iterator();
        List<Integer> ans = new ArrayList<>();
        while(it.hasNext()){
            ans.add(it.next());
        }
        return ans;
    }
}