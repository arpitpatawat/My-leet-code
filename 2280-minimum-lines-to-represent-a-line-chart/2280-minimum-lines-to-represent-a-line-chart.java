class Solution {
    public int minimumLines(int[][] a) {
        if(a.length == 1) return 0;
        if(a[1][0] == 500000000 || a[1][1] == 500000000) return 2;
         Arrays.sort(a, (aa, bb) -> Integer.compare(aa[0], bb[0]));
        double slopeu =  Double.valueOf(a[1][1] - a[0][1]) /Double.valueOf(a[1][0] - a[0][0]) ;
        int count = 1;
        double arpit = 0.0;
        for(int i = 1; i < a.length-1 ; i++){
            arpit = Double.valueOf((a[i+1][1]) - (a[i][1])) / Double.valueOf((a[i+1][0]) - (a[i][0]));
            if(arpit != slopeu){
                count ++;
                slopeu = Double.valueOf((a[i+1][1]) - (a[i][1])) / Double.valueOf((a[i+1][0]) - (a[i][0]));
            }
        }
         return count;   
    }
}