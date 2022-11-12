class Solution {
    public int[] findOrder(int v, int[][] pre) {
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
        
      int ans[] = new int[v];
      int index = 0;
      while(q.size() > 0){
          int element = q.poll();
          ans[index++] = element;
          for(int i = 0 ; i < n; ++i){
              if(pre[i][1] == element){
                  indeg[pre[i][0]]--;
                  if(indeg[pre[i][0]] == 0){
                      
                  q.offer(pre[i][0]);
                  }
              }
          }
      }
        if(index == v){
            return ans;
        }
        return new int[0];
    }
}