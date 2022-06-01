class Solution {
    public String intToRoman(int N) {
        int value[] = {1000, 900, 500 , 400, 100 , 90 , 50 ,40 ,10 , 9,5,4 ,1};
        String symbol[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        // String ans = "";
        // for(int i = 0 ; i < value.length && num!= 0; ++i){
        //     // if(num==0) break;
        //     while(num >= value[i]){
        //         num -= value[i];
        //         ans+= symbol[i];
        //     }
        // }
         StringBuilder ans = new StringBuilder();
        for (int i = 0; N > 0; i++)
            while (N >= value[i]) {
                ans.append(symbol[i]);
                N -= value[i];
            }
        return ans.toString();
        // return ans;
    }
}