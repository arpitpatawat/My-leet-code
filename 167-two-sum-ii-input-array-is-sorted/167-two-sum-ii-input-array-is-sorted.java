class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int output[] = new int[2];
        int low = 0;
        int high = numbers.length - 1;
        while(low < high){
            if(numbers[low] + numbers[high] == target){output[0] = low+1; output[1] = high + 1;
                                                      return output;}
            if(numbers[low] + numbers[high] > target){
                --high;
            }
            if(numbers[low] + numbers[high] < target){
                ++low;
            }
        }
       return output;
    }
}