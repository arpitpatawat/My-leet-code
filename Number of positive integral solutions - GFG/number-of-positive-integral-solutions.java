// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s = sc.next();
                    Solution obj = new Solution();
                    System.out.println(obj.posIntSol(s));
                }
                
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long fact(int n){
        if (n<=1) return 1;
        return n*fact(n-1);
    }
    long mul(int k, int n){
        if(n<=1) return k;
        return k*mul(k-1,n-1);
    }
    long posIntSol(String s)
    {
        //code here.
        int index = s.length() - 1;
       while(s.charAt(index) != '='){
           --index;
       }
       int k = Integer.parseInt(s.substring(index+1,s.length()));
       int n = s.charAt(index - 1) - 'a' + 1;
       long dr = fact(n-1);
       long nr = mul(k-1,n-1);
      // System.out.println(dr +"," + nr);
       return nr/dr;
       
    }
}