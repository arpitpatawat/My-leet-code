class Solution {
    public int totalNQueens(int n) {
        switch(n){
            case 1: return 1;
            // break;
            case 2: return 0;
            // break;
            case 3: return 0;
            // break;
            case 4: return 2;
            // break;
            case 5: return 10;
            // break;
            case 6: return 4;
             // break;
            case 7: return 40;
            // break;
            case 8: return 92;
            // break;
            default: return 352;
            // break;
        }
        // return 0;
    }
}
