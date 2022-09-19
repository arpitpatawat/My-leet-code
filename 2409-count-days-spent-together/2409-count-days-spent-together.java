class Solution {
    private int dayconvert(String s, int months[]){
        int day = s.charAt(4) - '0' + 10*(s.charAt(3) - '0');
        int month = s.charAt(1) - '0' + 10*(s.charAt(0) - '0');
        for(int i = 0 ; i < month - 1; ++i){   // from januray to july we are using loop
            day += months[i];
        }
        return day;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int months[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // we need to find out the day for each of them. eg-241 day etc .
        int aA = dayconvert(arriveAlice, months);
        int lA = dayconvert(leaveAlice , months);
        int aB = dayconvert(arriveBob , months);
        int lB = dayconvert(leaveBob , months);
        //System.out.println(aA +"," + lA +","+ aB +"," + lB);
        int leavefirst = Math.min(lA, lB);
        if(aB >= aA && aB <= lA){
            return leavefirst - aB + 1;
        }        
        else if(aA >= aB && aA <= lB){
            return leavefirst - aA + 1;
        }
        return 0;
    }
}