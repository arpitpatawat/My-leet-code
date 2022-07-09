// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());
            
            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<sz;i++)
                output.append(answer[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> q = new ArrayDeque<>();
        long ans[] = new long[N-K+1];
        int index = 0;
        
        // making first window 
        for(int i = 0 ; i < K ; ++i){
            if(A[i] < 0) q.offer(A[i]);
        }
        if(q.isEmpty()) ans[index++] = 0;
        else ans[index++] = q.peek();
        
        for(int i = K; i < N ; ++i){
            if(A[i] < 0) q.offer(A[i]); // if new element is -ve
            if(!q.isEmpty() && q.peek() == A[i-K]){  //removing old element 
                q.poll();
            } 
            // main process
            if(q.isEmpty()) ans[index++] = 0;
            else if(!q.isEmpty()) ans[index++] = q.peek();
            
        }
        return ans;
    }
}