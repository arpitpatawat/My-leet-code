class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        boolean bulky = false , heavy = false;
        long vol  = (long)length * (long)width * (long)height;
        if(length >= 10000 || width >= 10000 || height >= 10000 || mass >= 10000 || vol >= 1000000000) bulky = true;
        if(mass >= 100) heavy = true;
        // if(vol >= 1000000000)
        // System.out.println(vol);
        if(bulky && heavy) return "Both";
        else if(!bulky && !heavy) return "Neither";
        else if(bulky &&  !heavy) return "Bulky";
        else if(!bulky &&  heavy) return "Heavy";
        return "";
    }
}