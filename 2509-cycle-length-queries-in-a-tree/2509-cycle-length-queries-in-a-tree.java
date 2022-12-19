/* 
-> when we divide a node's value by 2 , we can get its parent
-> for the two nodes , we have to find LCA which will form the cycle
-> when i am going from node to it's parent, i am traversing an edge, at the end add 1 edge due to the connection we are making between these two nodes
*/
class Solution {
    public int[] cycleLengthQueries(int n, int[][] queries) {
        int ans[] = new int[queries.length];
        for(int i = 0 ; i < queries.length; ++i){
            int node1 = queries[i][0];
            int node2 = queries[i][1];
            int count = 0;
            while(node1 != node2){
                if(node1 > node2){
                    node1 /= 2;
                }
                else{
                    node2 /= 2;
                }
                ++count;
            }
            ans[i] = count + 1;
        }
        return ans;
    }
}