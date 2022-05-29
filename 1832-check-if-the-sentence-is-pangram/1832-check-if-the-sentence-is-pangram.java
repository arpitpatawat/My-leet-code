class Solution {
    public boolean checkIfPangram(String a) {
        int count = 0;
        for(int i = 0 ; i < a.length(); ++i){
            char num = a.charAt(i);
            System.out.println(a.indexOf(num));
            if(a.indexOf(num) != i) ++count;
        }
        return (a.length() - count ==26);
    }
}