class Solution {
    List<List<String>> result = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        boolean[] visited = new boolean[n];
    
        boolean[] dia1 = new boolean[2*n-1];
        boolean[] dia2 = new boolean[2*n-1];
        
        fun(n, new ArrayList<String>(),visited,dia1,dia2,0);
        
        return result;
    }
    
    private void fun(int n,List<String> list,boolean[] visited,boolean[] dia1,boolean[] dia2,int rowIndex){
        if(rowIndex == n){
            result.add(new ArrayList<String>(list));
            return;
        }
        
        for(int i=0;i<n;i++){
            
            if(visited[i] || dia1[rowIndex+i] || dia2[rowIndex-i+n-1])
                continue;
            
           
            char[] charArray = new char[n];
            Arrays.fill(charArray,'.');
            
            charArray[i] = 'Q';
            String stringArray = new String(charArray);
            list.add(stringArray);
            visited[i] = true;
            dia1[rowIndex+i] = true;
            dia2[rowIndex-i+n-1] = true;

            fun(n,list,visited,dia1,dia2,rowIndex+1);

            
            list.remove(list.size()-1);
            charArray[i] = '.';
            visited[i] = false;
            dia1[rowIndex+i] = false;
            dia2[rowIndex-i+n-1] = false;
        }
    }
    
}