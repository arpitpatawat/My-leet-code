class Solution {
    boolean flag = false;
    int lafda = -1;
    public boolean dfs(int node, int parent, Set<Integer> set, boolean vis[], List<List<Integer>> adj){
        if(vis[node]){
            set.add(node);
            lafda = node;
            return false;
        }
        
        vis[node] = true;
        
        for(int i : adj.get(node)){
            if(i != parent){
            if(!dfs(i,node,set,vis,adj)) {
                if(!flag && !set.add(node)){
                    flag = true;
                }
                else if(!flag) set.add(i);
                return false;
            }
            }
        }
        
        // set.remove(node);
        return true;
    }
    public int[] findRedundantConnection(int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int n = edges.length;
        for(int i = 0 ; i <= n ; ++i){
            adj.add(new ArrayList<Integer>());
        }
        for(int i[] : edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        boolean vis[] = new boolean[n+1];
        Set<Integer> set = new HashSet<>();
        dfs(1,-1,set,vis,adj);
        System.out.println(set);
        for(int i = n-1; i >= 0; --i){
            if(set.contains(edges[i][0]) && set.contains(edges[i][1])){
                return new int[]{edges[i][0], edges[i][1]};
            }
        }
        return edges[0];
    }
}