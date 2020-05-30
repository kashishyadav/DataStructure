/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Scanner;
//import java.util.Stack;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class spiralTraversal {
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
            spiralTraversal(root[k]);
         }

       }
    public static void spiralTraversal(Node root)
    {
        if(root==null)
           {
               return;
           }
           if(root.left==null && root.right==null)
           {
               System.out.print(root.data);
               return;
           }
        java.util.Stack<Node> s1=new java.util.Stack<>();
        java.util.Stack<Node> s2=new java.util.Stack<>();
        s1.push(root);
        StringBuilder sb=new StringBuilder();
        while(true)
        {
            if(s1.isEmpty() && s2.isEmpty())
            {
                break;
            }
            
            while(!s1.isEmpty())
            {
               
              Node temp=s1.pop();
              sb.append(temp.data+" ");

            if(temp.right!=null)
                s2.push(temp.right);
            
             if(temp.left!=null)
                s2.push(temp.left);
            }
            while(!s2.isEmpty())
            {
            Node temp1=s2.pop();
            sb.append(temp1.data+" ");
            if(temp1.left!=null)
                s1.push(temp1.left);
            if(temp1.right!=null)
                s1.push(temp1.right);

            }
            
        }
        System.out.print(sb);
              
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
    
}
