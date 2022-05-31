class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       for(int i = 0 ; i < s.length() - k +1; ++i){
            String sub = s.substring(i,i+k);
            int value = Integer.parseInt(sub,2);  
            if(!map.containsKey(value)){
               map.put(value,i);
            }
        }
        System.out.println(map);
        return (map.size() == Math.pow(2,k));
    }
}