class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new  HashMap<Character,Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C', 100);
        map.put('D',500);
        map.put('M',1000);
        int sum = 0;
        for(int i = 0 ; i < s.length() ; ++i){
            char num = s.charAt(i);
            int value = map.get(num);
            if(num== 'I'){
                if(i<s.length() -1 && map.get(s.charAt(i+1)) > value){
                    value = -1;
                }
            }
            if(num== 'X'){
                if(i<s.length() -1 && map.get(s.charAt(i+1)) > value){
                    value = - 10;
                }
            }
            if(num== 'C'){
                if(i<s.length() -1 && map.get(s.charAt(i+1)) > value){
                    value = - 100;
                }
            }
            sum += value;
            
            
        }
        return sum;
    }
}