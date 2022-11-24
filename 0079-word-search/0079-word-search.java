class Solution {
    public boolean exist(char[][] board, String word) {
        int row = board.length;
        int col = board[0].length;
        for(int i = 0 ; i < row; ++i){
            for(int j = 0 ; j < col; ++j){
                if(board[i][j] == word.charAt(0)){
                    if(dfs(i,j,board,word,0)){
                        return true;
                    }
                }
                    
            }
        }
        return false;
    }
    
    public boolean dfs(int curr_row, int curr_col, char[][] board, String word, int index){
        if(curr_row < 0 || curr_row == board.length || curr_col < 0 || curr_col == board[0].length ||                       word.charAt(index) != board[curr_row][curr_col]){
            return false;
        }
        if(index + 1 == word.length()){
            // System.out.println(word.charAt(index));
            return true;
        }
        board[curr_row][curr_col] ^= 128;
        boolean check =  dfs(curr_row + 1, curr_col, board, word, index+1) ||
               dfs(curr_row - 1, curr_col, board, word, index+1) ||
               dfs(curr_row , curr_col + 1, board, word, index+1) ||
              dfs(curr_row, curr_col -1 , board, word, index+1) ;
        board[curr_row][curr_col] ^= 128;
        return check;
    }
}

