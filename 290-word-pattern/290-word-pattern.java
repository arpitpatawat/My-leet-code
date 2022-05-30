class Solution {
    public boolean wordPattern(String pattern, String s) {
        s= s+" "; //east to get each word
        HashMap< String ,Character> map = new HashMap<String ,Character>();
        int res = 0; // substring 
        int count = 0; // pattern
        for(int i = 0 ; i < s.length() && count < pattern.length() ; ++i){
            char temp = s.charAt(i);
            if(temp == ' '){
                String alpha = s.substring(res, i);
                char value = pattern.charAt(count);
                res = i+1;
                if(map.containsKey(alpha) && !map.get(alpha).equals(value)){
                    return false;
                }
                if(!map.containsKey(alpha) && map.containsValue(value)){
                    return false;
                }
                map.put(alpha,value);
                ++count;
            }
        }
        System.out.println(count +" " + res);
        return (count==pattern.length() && res ==s.length())?true:false;
        }
}

//        for(int i =0 ; i < s.length() ; ++i)
//        {
//           char temp = s.charAt(i);
//            if(temp == ' ')
//            {
//                String alpha = s.substring(res,i);
//                res = i+1;
//                // System.out.println(!map.get(pattern.charAt(count)).equals(alpha));
//                // System.out.println(map.get(pattern.charAt(count)));
                
//                if(map.containsKey(pattern.charAt(count))  && !map.get(pattern.charAt(count)).equals(alpha) ) 
//                {
//                    return false;
//                }
               
               
//                map.put(pattern.charAt(count),alpha);
//                ++count;
//            }
//        }
     
            

                
          