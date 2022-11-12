class MedianFinder {
        ArrayList<Integer> arr;
       
    public MedianFinder() {
        arr = new ArrayList<>();
       
    }
    
    public void addNum(int num) {
        int index = arr.size() - 1;
        if(index == -1 || arr.get(index) <= num){
            arr.add(num);
            ++index;
            return ;
        }
        int low = 0;
        int high = index;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr.get(mid) == num){
                arr.add(mid,num);
                ++index;
                return ;
            }
            else if(arr.get(mid) < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        arr.add(low, num);
        ++index;
        return ;
    }
    
    public double findMedian() {
        // System.out.println(arr);
        // if index -> odd then even element and vice versa
        int index = arr.size() - 1;
        if(index %2 == 0){
            int element = index / 2;
            double d = arr.get(element);
            return d;
        }
        else{
            int element = index / 2;
            double d = arr.get(element) + arr.get(element + 1);
            return d/2;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */