class Solution {
    int min = Integer.MAX_VALUE;
    public void dfs(int node, ArrayList<ArrayList<ArrayList<Integer>>> adj, boolean vis[]){
        if(vis[node]) return ;
        vis[node] = true;
        
        for(ArrayList<Integer> i : adj.get(node)){
            min = Math.min(min, i.get(1));
            dfs(i.get(0), adj, vis);
        }
        return ;
    }
    public int minScore(int n, int[][] roads) {
         ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i = 0; i <= n; ++i){
            adj.add(new ArrayList<>());
        }
        for(int i[] : roads){
            int start = i[0];
            int end = i[1];
            int dist = i[2];
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(end);
            temp.add(dist);
            adj.get(start).add(temp);
            temp = new ArrayList<>();
            temp.add(start);
            temp.add(dist);
            adj.get(end).add(temp);
        }
        
        boolean vis[] = new boolean[n+1];
        
                dfs(n, adj, vis);

        return min;
    }
}