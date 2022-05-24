class Solution {
    public void swap(int a, int b, int arr[]){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sortColors(int[] a) {
      int low = 0, mid = 0;
      int high = a.length -1;
      while(mid <= high){
          if(a[mid] == 0){
              swap(low, mid,a);
              mid ++; low ++;
          }
          else if(a[mid] == 2){
              swap(high,mid,a);
              high--;
          }
          else mid++;
      }
    }
}