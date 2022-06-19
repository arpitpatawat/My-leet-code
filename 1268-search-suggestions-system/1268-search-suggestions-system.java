class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        List<List<String>> list = new ArrayList<>();
        String prefix = new String();
        for(int i=0; i<searchWord.length(); i++){
            List<String> sublist = new ArrayList<>();
            int count = 0;
            prefix += searchWord.charAt(i);
            for(String prod : products){
                if(prod.length() >= prefix.length() && prod.substring(0,i+1).equals(prefix) && count < 3){
                    sublist.add(prod);
                    count++;
                }
            }
            list.add(sublist);
        }
        return list;
    }
}