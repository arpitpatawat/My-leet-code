// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String A)
    {
        // code here
        Queue<Character> q = new ArrayDeque<>();
        String ans = "";
        int arr[] = new int[26];
        
        for(int i = 0 ; i < A.length() ; ++i){
            char temp = A.charAt(i);
            arr[A.charAt(i) - 'a']++;
            q.offer(temp);
            while(!q.isEmpty() && arr[q.peek() -'a'] > 1){
                q.poll();
            }
            if(q.isEmpty()){
                ans += '#';
            }
            else ans+= q.peek();
        }       
       
     return ans;   
        
    }
}