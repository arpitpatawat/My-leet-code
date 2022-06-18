class Solution {
    public int[] plusOne(int[] digits) {
     int len = digits.length;
     for(int i = len -1 ; i>=0; --i){
         if(digits[i] < 9){
             ++digits[i];
             return digits;
         }
         digits[i] = 0;
     }   
      int op[] = new int[len + 1];
    op[0]= 1;
        return op;
    }
}