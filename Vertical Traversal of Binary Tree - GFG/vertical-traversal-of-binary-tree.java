//{ Driver Code Starts
//Initial Template for Java

//Contributed by Sudarshan Sharma
import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
    
	        while(t-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
                Solution obj = new Solution();
                ArrayList <Integer> res = obj.verticalOrder(root);
                for (Integer num : res) System.out.print(num + " "); 
                System.out.println();
    	        
	        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Pair{
    int level;
    Node node;
    
    Pair(int level, Node node){
        this.level = level;
        this.node = node;
    }
}
class Solution
{
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code 
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new ArrayDeque<>();
        if(root == null){
            return ans;
        }
        map.put(0, new ArrayList<Integer>());
        map.get(0).add(root.data);
        q.offer(new Pair(0, root));
        while(!q.isEmpty()){
            for(int i = 0 ; i < q.size() ; ++i){
                Pair p = q.poll();
                if(p.node.left != null){
                    if(!map.containsKey(p.level - 1)){
                        map.put(p.level - 1, new ArrayList<Integer>());
                    }
                    map.get(p.level - 1).add(p.node.left.data);
                    q.offer(new Pair(p.level - 1 , p.node.left));
                }
                if(p.node.right != null){
                    if(!map.containsKey(p.level + 1)){
                        map.put(p.level + 1, new ArrayList<Integer>());
                    }
                    map.get(p.level + 1).add(p.node.right.data);
                    q.offer(new Pair(p.level + 1 , p.node.right));
                }
            }
        }
        // System.out.println(map);
        for (var entry : map.entrySet()) {
            for(int i = 0 ; i < entry.getValue().size() ; ++i){
                ans.add(entry.getValue().get(i));
            }
        //   System.out.println(entry.getKey() + "/" + entry.getValue());
            }
        
        return ans;
    }
}