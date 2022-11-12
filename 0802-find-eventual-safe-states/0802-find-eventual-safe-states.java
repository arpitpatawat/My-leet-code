class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        // changes the nodes
        //if a -> (b,c) then in b->a and c-> a
        ArrayList<ArrayList<Integer>> adjrev = new ArrayList<>();
        for(int i = 0 ; i < graph.length; ++i){
            adjrev.add(new ArrayList<Integer>());
        }
        int indeg[] = new int[graph.length];
        for(int i = 0 ; i < graph.length; ++i){
            for(int j : graph[i]){
                // i -> j then we want j -> i
                adjrev.get(j).add(i);
                // also indegee of i++ as j -> i
                indeg[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < indeg.length; ++i){
            if(indeg[i] == 0){
                q.offer(i);
            }
        }
        int temp[] = new int[graph.length];
        while(!q.isEmpty()){
            int element = q.poll();
            ++temp[element];
            
            for(int i : adjrev.get(element)){
                --indeg[i];
                if(indeg[i] == 0){
                    q.offer(i);
                }
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i < temp.length; ++i){
            if(temp[i] == 1){
                ans.add(i);
            }
        }
        return ans;
    }
}