class Solution {
    public void print(int a, int b, int c){
        System.out.println(a + "," + b + "," + c);
    }
    
    public void print(int a, int b){
        System.out.println(a + "," + b);
    }
    
    public void print(int a, int b, int c, int d){
        System.out.println(a + "," + b + "," + c + "," + d);
    }
    
    public int[] getOrder(int[][] tasks) {
        int n = tasks.length;
        int change[][] = new int[n][3];
        for (int i = 0; i < n; ++i) {
            change[i][0] = tasks[i][0];
            change[i][1] = tasks[i][1];
            change[i][2] = i;
        }
        
        Arrays.sort(change, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]));
        int start = change[0][0];
        int end = change[n-1][0];
        
        int ans[] = new int[n];
        int index = 0;
        int time = 0;
        
        // for(int i[] : change){
        //     System.out.println(Arrays.toString(i));
        // }
        
        for(int i = 0 ; i < n ; ++i){
            int curr_time = change[i][0];
            int curr_processingtime = change[i][1];
            int curr_id = change[i][2];
            if(pq.size() == 0 && curr_time > time){
                time = curr_time;
            }
            if(curr_time == time){
                pq.offer(new int[]{curr_processingtime,curr_id});
                int temp [] = pq.poll();
                // print(curr_time , time ,temp[0],  temp[1]);
                time += temp[0];
                ans[index++] = temp[1];
            }
            else if(curr_time > time){
                while(curr_time > time && pq.size() > 0){
                    
                int temp [] = pq.poll();
                  // print(curr_time , time ,temp[0],  temp[1]);
                time += temp[0];
                ans[index++] = temp[1];
                }
                pq.offer(new int[]{curr_processingtime,curr_id});
            }
            else{
                pq.offer(new int[]{curr_processingtime,curr_id});
            }
        }
        
        while(pq.size() > 0){
            ans[index++] = pq.poll()[1];
        } 
        
        return ans;
    }
}
