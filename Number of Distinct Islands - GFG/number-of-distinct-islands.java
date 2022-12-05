//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[][] grid = new int[n][m];

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < m; j++) {
                    grid[i][j] = sc.nextInt();
                }
            }

            Solution ob = new Solution();
            int ans = ob.countDistinctIslands(grid);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String dfs(int i, int j , int [][] grid, String s){
        if(i < 0 || j < 0 || i == grid.length || j == grid[0].length || grid[i][j] == 0){
            return "";
        }
        
        grid[i][j] = 0;
      
      return  s + dfs(i+1,j,grid,"b") + dfs(i-1, j , grid, "t") + dfs(i, j+1, grid, "r") + dfs(i,j-1,grid,"l") + "z";
    }
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        Set<String> set = new HashSet<>();
        for(int i = 0 ; i < grid.length; ++i){
            for(int j = 0 ; j < grid[i].length; ++j){
                if(grid[i][j] == 1){
                    set.add("" + dfs(i,j,grid,"x"));
                }
            }
        }
        return set.size();
    }
}
