//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m=sc.nextInt();
            int[][] edge = new int[m][2];
            for(int i=0;i<m;i++){
                edge[i][0]=sc.nextInt();
                edge[i][1]=sc.nextInt();
            }
            int src=sc.nextInt();
            Solution obj = new Solution();
            int res[] = obj.shortestPath(edge,n,m,src);
            for(int i=0;i<n;i++){
                System.out.print(res[i]+" ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public int[] shortestPath(int[][] edges,int n,int m ,int src) {
        // Code here
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < n; ++i){
            adj.add(new ArrayList<>());
        }
        
        for(int i[] : edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        
        int ans[] = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        
        ans[src] = 0;
        q.offer(src);
        while(q.size() > 0){
            int element = q.poll();
            int dist = ans[element];
            // System.out.println(element + "," + dist);
            for(int i : adj.get(element)){
                if(ans[i] == Integer.MAX_VALUE){
                    ans[i] = dist + 1;
                    q.offer(i);
                }
                else{
                    ans[i] = Math.min(ans[i], dist + 1);
                }
            }
        }
        for(int i = 0 ; i < ans.length; ++i){
            if(ans[i] == Integer.MAX_VALUE){
                ans[i] = -1;
            }
        }
        return ans;
    }
}