/*
the whole questions is summerised as -
for each node in the graph, you need to find sum of at most k adjacent nodes + sum of node itself
and at the end , return the max sum .

ez soln - 
-> first create a adj list which consists node and its adjacent nodes value 
-> since i only need max value , i sort every values list in the adj in reverse order
-> the top k max values for each node will be my answer.
*/

class Solution {
    static int maxStarSum(int[] vals, int[][] edges, int k) {
        List<List<Integer>> values = new ArrayList<>();
        for(int i = 0; i < vals.length; i++){
            values.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            values.get(edge[0]).add(vals[edge[1]]);
            values.get(edge[1]).add(vals[edge[0]]);
        }
        for(List<Integer> v : values)
            Collections.sort(v, Collections.reverseOrder());
        
        int maxResult = Integer.MIN_VALUE;
        for(int i = 0; i < values.size(); i++){
            int end = Math.min(k, values.get(i).size()), sum = vals[i];
            for(int j = 0; j < end; j++){
                if(values.get(i).get(j) <= 0) break;
                sum += values.get(i).get(j);
            }
            maxResult = Math.max(maxResult, sum);
        }
        return maxResult;
    }
}