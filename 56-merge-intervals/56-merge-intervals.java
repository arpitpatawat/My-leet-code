class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
     int index = 0;
     List<List<Integer>> arr = new ArrayList<List<Integer>>();
     int min = intervals[0][0];
     int max = intervals[0][1];
     for(int i = 1 ; i < intervals.length ; ++i){
         if(intervals[i][0] <= max){
             if(intervals[i][1] > max) max = intervals[i][1];
         }
         else{
             List<Integer> temp = new ArrayList<>();
             temp.add(min);
             temp.add(max);
             arr.add(temp);
             min = intervals[i][0];
             max = intervals[i][1];
         }
     }
        List<Integer> temp = new ArrayList<>();
             temp.add(min);
             temp.add(max);
             arr.add(temp);
       
        int ans[][] = new int[arr.size()][2];
        for(int i = 0 ; i < arr.size(); ++i){
            ans[i][0] = arr.get(i).get(0);
            ans[i][1] = arr.get(i).get(1);
        }
     return ans;
     
    }
}