//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = Integer.parseInt(sc.next());
		while(t-- > 0)
		{
		    int n = Integer.parseInt(sc.next());
		    int k = Integer.parseInt(sc.next());
		    
		    String[] words = new String[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        words[i] = sc.next();
		    }
		    
		    Solution ob = new Solution();
		  //  System.out.println(T.findOrder(words,k));
		    String order = ob.findOrder(words,n,k);
		    if(order.length() == 0){
		        System.out.println(0);
		        continue;
		    }
		    String temp[] = new String[n];
		    for(int i=0;i<n;i++)
		        temp[i] = words[i];
		    
		    Arrays.sort(temp, new Comparator<String>(){
		    
		      @Override
                public int compare(String a, String b) {
                    int index1 = 0;
                    int index2 = 0;
                    for(int i = 0; i < Math.min(a.length(), b.length()) 
                                        && index1 == index2; i++) {
                        index1 = order.indexOf(a.charAt(i));
                        index2 = order.indexOf(b.charAt(i));
                    }
                
                    if(index1 == index2 && a.length() != b.length()) 
                    {
                        if(a.length() < b.length())
                            return -1;
                        else
                            return 1;
                    }
                
                    if(index1 < index2)
                        return -1;
                    else
                        return 1;
                        
                }
		    });
		    
		    int flag = 1;
		    for(int i=0;i<n;i++)
		    {
		        if(!words[i].equals(temp[i]))
	            {
	                flag = 0;
	                break;
	            }
		    }
		    
		    System.out.println(flag);
		}
	}
	
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public void helper(String dict[] ,List<List<Integer>> list ){
        for(int i = 0 ; i < dict.length - 1; ++i){
            String s1 = dict[i];
            String s2 = dict[i+1];
            int l1 = 0;
            int l2 = 0;
            while(l1 < s1.length() && l2 < s2.length()){
                if(s1.charAt(l1) != s2.charAt(l2)){
                    list.get(s1.charAt(l1) - 'a').add(s2.charAt(l2) - 'a');
                    break;
                }
                ++l1;
                ++l2;
            }
        }
        
        return ;
    }
    public String findOrder(String [] dict, int N, int K)
    {
        // Write your code here
        // first create this into a graph
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0 ; i < K; ++i){
            list.add(new ArrayList<>());
        }
        helper(dict, list);
        // System.out.println(list);
        int indeg[] = new int[K];
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0 ; i < K; ++i){
            for(int j : list.get(i)){
                indeg[j]++;
            }
        }
        for(int i = 0 ; i < K; ++i){
            if(indeg[i] == 0){
                q.offer(i);
            }
        }
        char arr[] = new char[K];
        int index = 0;
        while(q.size()> 0){
            int element = q.poll();
            arr[index++] = (char) ('a' + element);
        
        for(int i : list.get(element)){
            indeg[i]--;
            if(indeg[i] == 0){
               q.offer(i); 
            }
        }
        }
        return new String(arr);
        
    }
}