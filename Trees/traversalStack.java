/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author KASHISH YADAV
 */
public class btTraversal {
    
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
           
            System.out.println("inorder:");
            inorder(root[k]);
            System.out.println("prerder:");
            preorder(root[k]);
            System.out.println("postorder:");
            postorder(root[k]);
            
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
 

      public static void inorder(Node root)
      {
          Node curr=null;
          if(root==null)
              return;
          Stack<Node> s=new Stack<>();
         // s.push(root);
          curr=root;
          while(curr!=null || s.size()>0)
          {
            while(curr!=null)
            {
                s.push(curr);
                curr=curr.left;
            }
            curr=s.pop();
            System.out.print(curr.data+" -> ");
            curr=curr.right;
          }
      }
      public static void preorder(Node root)
      {
          if(root==null)
              return;
          Stack<Node> s=new Stack<>();
          s.push(root);
          while(!s.isEmpty())
          {
              Node temp=s.peek();
              System.out.print(temp.data+" -> ");
              s.pop();
              
              if(temp.right!=null)
                  s.push(temp.right);
              if(temp.left!=null)
                  s.push(temp.left);
          }
      }
      public static void postorder(Node p)
      {
          if(p==null)
              return;
          Stack<Node> s=new Stack<>();
         // s.push(root);
          while(true)
          {  if(p!=null)
              {
                  s.push(p);
                  p=p.left;
              }
              else{
                  if(s.isEmpty())
                      break;
                  else{
                  if(s.peek().right==null)
                  {
                      System.out.print(s.peek().data+" -> ");
                      p=s.pop();
                      while(!s.isEmpty() && p!=null && s.peek().right!=null  && p==s.peek().right)//right subtree completion condition chek whether top element parrent
                      {
                        System.out.print(s.peek().data+" -> ");
                        p=s.pop();
                      }
                  }                  
                  if(!s.isEmpty())
                  {
                      p=s.peek().right;
                  }
                  else
                      p=null;
                  }
              }              
          }
      }
      
}
