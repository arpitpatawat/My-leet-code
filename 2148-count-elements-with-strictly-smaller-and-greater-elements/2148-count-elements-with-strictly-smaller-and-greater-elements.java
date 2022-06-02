class Solution {
    public int countElements(int[] a) {
      int min = a[0] , max = a[0];
      int minocr = 1, maxocr= 1;
      for(int i = 1 ; i < a.length ; ++i){
          {
              if(a[i] < min) {min = a[i]; minocr = 1;}
          else if(a[i] == min) minocr ++;
          }
          if(a[i] > max) {max = a[i]; maxocr = 1;}
          else if(a[i] == max) maxocr ++;
      }
        return (min==max) ? 0: a.length - minocr - maxocr;
    }
}