class Solution {
    public int minimumNumbers(int num, int k) {
        if(num == 0 ) return 0;
        else if(k==num) return 1;
        int x = 1;
        while(k * x <= num && x <= 10){
            if((k * x)%10 == num % 10) return x;
            ++x;
        }
        return -1;
    }
}