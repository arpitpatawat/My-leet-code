// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Driverclass
{
    public static void main (String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            while(n-- > 1){
		        tail.next = new Node(sc.nextInt());
		        tail = tail.next;
		    }
		   
		      head = new Solution().segregate(head);
		     printList(head);
		    System.out.println();
        }
    }
    
    public static void printList(Node head)
    {
        if(head == null)
           return;
           
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    
    
}



// } Driver Code Ends


//User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution
{
    //Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head)
    {
        // add your code here
        Node zs = null;
        Node ze = null;
        Node os = null;
        Node oe = null;
        Node ts = null;
        Node te = null;
        while(head != null){
            switch(head.data){
                case 0:
                    {
                        if(zs == null && ze == null) {ze = head; zs = ze;}
                        else {ze.next = head;
                            ze = head;}
                        break;
                    }
                case 1:
                    {
                        if(os == null && oe == null) {oe = head; os = oe;}
                        else {oe.next = head;
                            oe = head;}
                        break;
                    }
                default : {
                    if(ts == null && te == null) {te = head; ts = te;}
                        else {te.next = head;
                            te = head;}
                        break;
                         }
            }
            head = head.next;
        }
        Node finalhead = null;
        //Node finaltail = null;
        if(te != null) {
        te.next = finalhead;
        finalhead = ts;
        }
        if(oe != null){
          oe.next = finalhead;
          finalhead = os;
        }
        if(ze != null)
        {ze.next = finalhead; 
        finalhead = zs;}
        return finalhead;
    }
}


