//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S1 = br.readLine().trim().split(" ");
            int n = Integer.parseInt(S1[0]);
            int m = Integer.parseInt(S1[1]);
            int[][] edges = new int[m][3];
            for(int i = 0; i < m; i++){
                String S2[] = br.readLine().trim().split(" ");
                for(int j = 0; j < 3; j++)
                    edges[i][j] = Integer.parseInt(S2[j]);
            }
            Solution obj = new Solution();
            int ans = obj.isNegativeWeightCycle(n, edges);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int isNegativeWeightCycle(int n, int[][] edges)
    {
        //code here
        int ans[] = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[0] = 0;
        for(int k = 0 ; k < n - 1; ++k){
            for(int i[] : edges){
                int start = i[0];
                int end = i[1];
                int wt = i[2];
                
                if(ans[start] != Integer.MAX_VALUE && ans[end] > ans[start] + wt){
                    ans[end] = ans[start] + wt;
                }
                
            }
        }
        
        // to check for -ve cycle
         for(int k = 0 ; k < 1; ++k){
            for(int i[] : edges){
                int start = i[0];
                int end = i[1];
                int wt = i[2];
                
                if(ans[end] != Integer.MAX_VALUE && ans[end] > ans[start] + wt){
                    return 1;
                }
                
            }
        }
        return 0;
    }
}