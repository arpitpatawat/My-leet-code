class Solution {
    public boolean canFinish(int v, int[][] pre) {
       // b -> a, graph is like this
      int n = pre.length;
      Queue<Integer> q = new LinkedList<>();
      int indeg[] = new int[v];
      for(int i = 0 ; i < n; ++i){
          indeg[pre[i][0]]++;
      }
      for(int i = 0 ; i < v; ++i){
          if(indeg[i] == 0){
              q.offer(i);
          }
      }
// System.out.println(q);
      int ans = 0;
      while(q.size() > 0){
          int element = q.poll();
          ++ans;
          for(int i = 0 ; i < n; ++i){
              if(pre[i][1] == element){
                  indeg[pre[i][0]]--;
                  if(indeg[pre[i][0]] == 0){
                      
                  q.offer(pre[i][0]);
                  }
              }
          }
      }
        return ans == v;
        
    }
}