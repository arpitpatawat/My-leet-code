//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.math.*;

class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}

class GFG
{
    static Node buildTree(String str)
    {
        // Corner Case
        if(str.length() == 0 || str.equals('N'))
            return null;
        String[] s = str.split(" ");
        
        Node root = new Node(Integer.parseInt(s[0]));
        Queue <Node> q = new LinkedList<Node>();
        q.add(root);
        
        // Starting from the second element
        int i = 1;
        while(!q.isEmpty() && i < s.length)
        {
              // Get and remove the front of the queue
              Node currNode = q.remove();
        
              // Get the curr node's value from the string
              String currVal = s[i];
        
              // If the left child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the left child for the curr node
                  currNode.left = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.left);
              }
        
              // For the right child
              i++;
              if(i >= s.length)
                  break;
              currVal = s[i];
        
              // If the right child is not null
              if(!currVal.equals("N")) 
              {
        
                  // Create the right child for the curr node
                  currNode.right = new Node(Integer.parseInt(currVal));
        
                  // Push it to the queue
                  q.add(currNode.right);
              }
              
              i++;
        }
    
        return root;
    }
    
    public static void main(String args[]) throws IOException {
    
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t>0)
        {
            String s = br.readLine();
            Node root = buildTree(s);
            
            Solution T = new Solution();
            System.out.println(T.largestBst(root));
            
            t--;
        }
    }
}


// } Driver Code Ends


//User function Template for Java

// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

// left ka max, right ka min check krna hai 
class Info{
    int min;
    int max;
    int size;
    
    Info(int min, int max , int size){
        this.min = min;
        this.max = max;
        this.size = size;
    }
    
    void printt(){
        System.out.print(" min" + min);
        System.out.print(" max" + max);
        System.out.println(" size" + size);
    }
    
}

class Solution{
    static Info helper(Node root){
        if(root == null){
            return new Info(Integer.MAX_VALUE, Integer.MIN_VALUE , 0);
        }
        
        Info left = helper(root.left);
        Info right = helper(root.right);
        boolean curr_valid =  left.max < root.data  && right.min > root.data ;
        int curr_min = (curr_valid) ? Math.min(root.data , left.min) : Integer.MIN_VALUE;
        int curr_max =(curr_valid) ? Math.max(root.data  , right.max) : Integer.MAX_VALUE;
        int curr_size = (curr_valid) ? left.size + right.size + 1 : Math.max(left.size , right.size);
        
        Info curr =  new Info(curr_min , curr_max, curr_size);
        // System.out.println(root.data);
        // curr.printt();
        return curr;
            
    }
    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root)
    {
       Info xd = helper(root);
       return xd.size;
        
    }
    
}