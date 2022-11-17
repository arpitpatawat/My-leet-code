class Solution {
    public boolean checkHeight(int a_y1, int a_y2, int b){
        if( b <= a_y2 && b >= a_y1){
            return true;
        }
        else{
            return false;
        }
    }
    
     public boolean checkWidth(int a_y1, int a_y2, int b){
        if( b <= a_y2 && b >= a_y1){
            return true;
        }
        else{
            return false;
        }
    }
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int height = 0;
        if(checkHeight(ay1, ay2, by1) && checkHeight(ay1,ay2, by2)){  // b lies inside a
            height = Math.abs(by2 - by1);
        }
        else if(checkHeight(by1,by2,ay1) && checkHeight(by1,by2,ay2)){ // a lies inside b
            height = Math.abs(ay2- ay1);
        }
        else if(checkHeight(ay1, ay2, by2)){ // by1 lies inside a
            height = Math.abs(by2 - ay1);
            
        }
        else if(checkHeight(ay1, ay2 , by1)){ // by2 lies inside a
            height = Math.abs( - by1 + ay2);
        }
        else if(checkHeight(by1, by2, ay2)){ // ay1 lies inside b
            height = Math.abs(ay2 - by1);
        }
        else if(checkHeight(by1, by2 , ay1)){ // by2 lies inside a
            height = Math.abs(by2 - ay1);
        }
        else height = 0;
        
        int width = 0;
        if(checkWidth(ax1 ,ax2, bx1) && checkWidth(ax1, ax2, bx2)){
            width = Math.abs(bx2 - bx1);
        }
        else if(checkWidth(bx1, bx2 , ax1) && checkWidth(bx1, bx2 , ax2)){
            width = Math.abs(ax2 - ax1);
                        // System.out.println(height);

        }
        else if(checkWidth(ax1, ax2, bx1)){
            width = Math.abs(ax2 - bx1);
        }
        else if(checkWidth(ax1, ax2, bx2)){
            width = Math.abs(bx2 - ax1);
        }
        else if(checkWidth(bx1, bx2 , ax1)){
            width = Math.abs(bx2 - ax1);
        }
        else if(checkWidth(bx1, bx2 , ax2)){
            width = Math.abs(ax2 - bx1);
        }
        else width = 0;
        
       int area_a = Math.abs(ay2 - ay1) * Math.abs(ax2 - ax1);
       int area_b = Math.abs(by2 - by1) * Math.abs(bx2 - bx1);
       return area_a + area_b - height * width;
    }
}