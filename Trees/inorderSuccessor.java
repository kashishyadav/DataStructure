/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Scanner;

/**
 *
 * @author KASHISH YADAV
 */
public class inorderSuccessor {
          static class Node
      {
        int data;
        Node left;
        int d=0;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
            this.d=0;
        }
        public void setd_val(int d)
        {
            this.d=d;
        }
    }

  
    public static void main(String arg[])
    { 
      Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of tree: ");
        int t=sc.nextInt();
        Node root[]=new Node[t];
        int h=t;
        int j=0;
        while(t>0)
        {
            System.out.println("enter the number of nodes: ");
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("enter the nodes: ");
                root[j]=addNode(root[j],sc.nextInt());
            }
            --t;
            j++;
            
        }
        for(int k=0;k<h;k++)
        {
            System.out.println("enter the  nodes for ancestor: ");
            int h1=sc.nextInt();
           System.out.println("minimume: "+minRight(root[k]).data);
           Node tew=searchNode(root[k],h1);
           if(tew!=null)
           System.out.println("minimume: "+tew.data);
           else
               System.out.println("no data...");
           Node p=succsessor(root[k], h1);
           if(p!=null)
           System.out.println("inorder successor :"+p.data);
           else
            System.out.println("no successor...");   
            
            
         }

       }
   
     public static Node addNode(Node root,int data)
    {
        if(root==null)
        {
            root=new Node(data);
            return root;
        }
        else if(root.data<data)
        {
            root.right=addNode(root.right,data);
        }
        else{
            root.left=addNode(root.left,data);
        }
        return root;
    }
   public static Node succsessor(Node root,int search)
   {
       //successor is the node that will come immediate after the node in soprted inorder traveral....
       Node s=searchNode(root,search);
       if(s!=null)
       {
           //if right subtree exist...
           if(s.right!=null)
           {
               return minRight(s.right);
           }
           else{
               Node succ=null;
               while(root!=null)
               {
                   if(root.data>s.data)
                   {
                       succ=root;
                       root=root.left;
                   }
                   else if(root.data<s.data)
                   {
                       root=root.right;
                   }
                   else{
                       break;
                   }
                   
               }
               return succ;
           }
           
       }
       
           return null;
       
       
   }
   public static Node minRight(Node root)
   {
       if(root==null)
           return null;
       Node min=null;
       while(root!=null)
       {
           min=root;
           root=root.left;
       }
       return min;
   }
   public static Node searchNode(Node root,int s)
   {
       Node succ=null;
             while(root!=null)
               {
                   if(root.data==s)
                   {
                       succ=root;
                       break;
                   }
                   if(root.data>s)
                   {
                       //succ=root;
                       root=root.left;
                   }
                   else if(root.data<s)
                   {
                       root=root.right;
                   }
                   
               }
             return succ;
   }
}
