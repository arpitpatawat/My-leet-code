class Solution {
    public int maximum69Number (int num) {
        int temp[] = new int[5];
        int index = 0;
        while(num > 0){
            temp[index++] = num % 10;
            num /= 10;
        }
        
        for(int i = index - 1 ; i >= 0 ; --i){
            if(temp[i] == 6){
                temp[i] = 9;
                break;
            }
        }
        for(int i = index - 1; i >= 0 ; --i){
            num = num * 10 + temp[i];
        }
        return num;
    }
}