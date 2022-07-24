class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        // do binary serch 
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        int index = -1;
        int fina = k;
        while(low <= high){
            int mid = low + (high - low) /2;
            if(arr[mid] == x){
                index = mid;
                break;
            }
            else if(arr[mid] > x){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
          // System.out.println(low + "," + high +"," + index);
        if(index == -1){  // when we could not find that element
            
            if(low >= n) index = high;
            else if(high < 0) index = low;
            else{
                index = ((arr[low] - x) >= (x - arr[high])) ? high : low;
            }
        }
        k -= 1;
        low = index - 1;
        high = index + 1;
        while(low >= 0 && high < n && k > 0){
           // if((arr[high] - x) == (x - arr[low])){
           //     --low;
           //     ++high;
           //     --k;
           // }
         if((arr[high] - x)  >= (x - arr[low])){
            --low;
            --k;
        }
            else{
                ++high;
                --k;
            }
        }
                    // System.out.println(low + "," + high +"," + index);
        List<Integer> ans = new ArrayList<Integer>();
        // either k == 0 or any one of them crossed array index out of bounds ;
       
            // System.out.println("1st");
            
        
                        // System.out.println("2st");
            if(low < 0){
                for(int i = 0 ; i < fina ; ++i){
                    ans.add(arr[i]);
                }
            }
            else if(high >= n){
                            // System.out.println("3st");
                for(int i = n-fina ; i < n ; ++i ){
                    ans.add(arr[i]);
                }
            }
            else{
             for(int i = low + 1 ; i < high ; ++i){
                ans.add(arr[i]);
            }
            }
        
        return ans;
    }
}