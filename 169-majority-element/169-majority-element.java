class Solution {
    public int majorityElement(int[] a) {
     int element =  0;
    int count = 0;
        for(int i : a){
            if(count == 0) element = i;
            if(i == element){
                count +=1;
            }
            else count-=1;
        }
        return element;
    }
}