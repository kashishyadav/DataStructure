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
 * @author SUDHANSHU YADAV
 */
public class rootToLeafSum {
    static int miniLevel=0;
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
            System.out.println("enter sum: ");
            int sum=sc.nextInt();
            Stack<Integer> s=new Stack<>();
            new rootToLeafSum().leafTraversal(root[k],sum,s);
            
         }

       }
    int sum=0;
    
    public void leafTraversal(Node root,int k,Stack<Integer> s)
    {
        if(root==null)
           {
               return;
           }
        sum=sum+root.data;
        s.push(root.data);
       
        if(sum==k)
        {
            while(!s.isEmpty())
            {
                System.out.print(s.pop()+" ");
            }
            return;
        }
         leafTraversal(root.left,k, s);
         leafTraversal(root.right, k, s);
         sum=sum-root.data;
         if(!s.isEmpty())
         s.pop();
          
    }
    public boolean pathExist(Node root,int sum)
    {
        if(root==null)
            return sum==0;
        
        return pathExist(root.left,sum)|| pathExist(root.right,sum);
    }
    public static void smallestPath(Node root,int sum,int level)
    {
        if(root==null)
            return; 
       int subsum=sum-root.data;
       if(root.left==null && root.right==null)
       {
           if(subsum==0)
           {
               miniLevel=Math.max(level,miniLevel);
               return;
           }
       }
        smallestPath(root.left, subsum, level+1);
        smallestPath(root.right, subsum, level+1);
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
