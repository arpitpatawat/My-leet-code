class Solution {
    public List<List<String>> addArpit(List<List<String>> op, List<String> arpit){
        List<String> temp = new ArrayList<>();
        int i = 0;
        while(i < arpit.size() && i < 3){
            temp.add(arpit.get(i));
            ++i;
        }
        op.add(temp);
        return op;
    }
    
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> op = new ArrayList<List<String>>();
        List<String> arpit = new ArrayList<>();
        char temp = searchWord.charAt(0);
        Arrays.sort(products);
        // array sorted 
        for(int i = 0 ; i < products.length ; ++i){
            if(products[i].charAt(0) == temp) arpit.add(products[i]);
        }
        op = addArpit(op,arpit);
        // all the words that share the first char are put in the op list
        
        // CheckPoint
        
        for(int i = 1 ; i < searchWord.length() ; ++i){
            temp = searchWord.charAt(i);
            int k = 0;
            while(k < arpit.size()){
                 // System.out.println( i +"," + searchWord.length());
            if(i >= arpit.get(k).length() || arpit.get(k).charAt(i) != temp)
               { 
                arpit.remove(k);
                --k;
               }
                ++k;
            }
            op = addArpit(op,arpit);
        }
        return op;
    }
}