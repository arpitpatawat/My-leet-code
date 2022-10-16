class Solution {

    class Pair {
        int r, c, time;

        public Pair(int r, int c, int time) {
            this.r = r;
            this.c = c;
            this.time = time;
        }
    }

    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        // create a visited array
        // int vis[][] = new int[row][col];
        Queue<Pair> q = new LinkedList<>();
        // int count_ones = 0;
        // first mark the 2 at the starting and keep a record of 1's that are there
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col; ++j) {
                if (grid[i][j] == 2) {
                    q.offer(new Pair(i, j, 0));
                }
            }
        }

        int time = 0;
        while (!q.isEmpty()) {
            Pair p = q.poll();
            int r = p.r;
            int c = p.c;
            int t = p.time;
            // System.out.print(r + "," + c);
            time = t;
            if (r - 1 >= 0 && grid[r - 1][c] == 1) {
                grid[r - 1][c] = 2;

                q.offer(new Pair(r - 1, c, t + 1));
            }
            if (r + 1 < row && grid[r + 1][c] == 1) {
                grid[r + 1][c] = 2;

                q.offer(new Pair(r + 1, c, t + 1));
            }
            if (c - 1 >= 0 && grid[r][c - 1] == 1) {
                grid[r][c - 1] = 2;

                q.offer(new Pair(r, c - 1, t + 1));
            }
            if (c + 1 < col && grid[r][c + 1] == 1) {
                grid[r][c + 1] = 2;

                q.offer(new Pair(r, c + 1, t + 1));
            }
        }

        for (int i = 0; i < row; ++i) {
            // System.out.println(Arrays.toString(grid[i]));
            for (int j = 0; j < col; ++j) {
                if (grid[i][j] == 1) {
                    return -1;
                }
            }
        }

        return time;
    }
}
// System.out.println(r-1 +"," + c); // System.out.println(r+1 +"," + c);    // System.out.println(r +"," + (c-1));   // System.out.println(r +"," + (c+1));
