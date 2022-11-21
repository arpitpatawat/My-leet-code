class Data{
    int dist;
    int row;
    int col;
    
    Data(int a, int b, int c){
        dist = a;
        row = b;
        col = c;
    }
}

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
            PriorityQueue<Data> q = new PriorityQueue<>((a,b) -> a.dist - b.dist);
            int row = maze.length;
            int col = maze[0].length;
            int visited[][] = new int[row][col];
            
        for(int i = 0 ; i < row; ++i){
            for(int j = 0 ; j < col; ++j){
                if(maze[i][j] == '.'){      // empty cell
                   visited[i][j] = Integer.MAX_VALUE; 
                }
                else{               //wall
                    visited[i][j] = -1;
                }
            }
        }
        q.offer(new Data(0,entrance[0],entrance[1]));
        
        //  ------------------------ checked
        while(q.size() > 0){
            Data d = q.poll();
            int dist = d.dist;
            int curr_row = d.row;
            int curr_col = d.col;
                        // System.out.println(curr_row +"," + curr_col);

            if(curr_row == 0 || curr_col == 0 || curr_row == row -1 || curr_col == col - 1 ){
                if(curr_row != entrance[0] || curr_col != entrance[1]){
                    return dist;
                }
            }
            
            if(curr_row - 1 >= 0 && visited[curr_row - 1][curr_col] != -1 && dist + 1 < visited[curr_row - 1][curr_col]){
                visited[curr_row - 1][curr_col] = dist + 1;
                q.offer(new Data(dist + 1, curr_row - 1, curr_col));
            }
            
            if(curr_row + 1 < row && visited[curr_row + 1][curr_col] != -1 && dist + 1 < visited[curr_row + 1][curr_col]){
                visited[curr_row + 1][curr_col] = dist + 1;
                q.offer(new Data(dist + 1, curr_row + 1, curr_col));
            }
            
             if(curr_col - 1 >= 0 && visited[curr_row ][curr_col - 1] != -1 && dist + 1 < visited[curr_row ][curr_col - 1]){
                visited[curr_row ][curr_col - 1] = dist + 1;

                q.offer(new Data(dist + 1, curr_row , curr_col - 1));
            }
            
            if(curr_col + 1 < col  && visited[curr_row ][curr_col + 1] != -1 && dist + 1 < visited[curr_row ][curr_col + 1]){
                visited[curr_row ][curr_col + 1] = dist + 1;
                q.offer(new Data(dist + 1, curr_row , curr_col + 1));
            }
            
        }
        
        return -1;
    }
}