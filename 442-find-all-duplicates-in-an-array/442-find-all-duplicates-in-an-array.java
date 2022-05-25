class Solution {
    public List<Integer> findDuplicates(int[] a) {
        List<Integer> map = new ArrayList<Integer>();
     for(int i = 0 ; i < a.length ; ++i){
         if(a[Math.abs(a[i])-1] < 0){
             map.add(Math.abs(a[i]));
         }
         else {a[Math.abs(a[i])-1] = -a[Math.abs(a[i])-1];}
     }   
        return map;
    }
}