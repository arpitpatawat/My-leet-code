//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while (T-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[][] edge = new int[m][3];
			for (int i = 0; i < m; i++) {
				edge[i][0] = sc.nextInt();
				edge[i][1] = sc.nextInt();
				edge[i][2] = sc.nextInt();
			}
			Solution obj = new Solution();
			int res[] = obj.shortestPath(n, m,edge);
			for (int i = 0; i < n; i++) {
				System.out.print(res[i] + " ");
			}
			System.out.println();
		}
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    
    public void dfs(int node, int[][] edges, Stack<Integer> stk, boolean[] vis){
        if(vis [node]){
            return ;
        }
        vis[node] = true;
        
        for(int[] i : edges){
            if(i[0] == node){
                dfs(i[1],edges, stk, vis);
            }
        }
        
        stk.push(node);
        return ;
        
    }
	public int[] shortestPath(int N,int M, int[][] edges) {
		//Code here
		//first find the topo sort
		Stack<Integer> stk = new Stack<>();
		boolean[] vis = new boolean[N];
		for(int i = 0 ; i < N; ++i){
		    dfs(i, edges, stk, vis);
		}
	    
	    int ans[] = new int[N];
	    Arrays.fill(ans, Integer.MAX_VALUE);
		ans[0] = 0;
// 		System.out.println(stk);
		while(stk.size() > 0){
		    int element = stk.pop();
		    int dist = ans[element];
		    if(dist == Integer.MAX_VALUE){ // this node is not reachable so we can't go further
		        ans[element] = -1;
		        continue;
		    }
		  //  System.out.println(element);
		    for(int[] i : edges){
            if(i[0] == element){
                ans[i[1]] = Math.min(ans[i[1]] , dist + i[2]);
            }
        }
		  //  System.out.println(Arrays.toString(ans));
		}
		
		return ans;
		
	}
}