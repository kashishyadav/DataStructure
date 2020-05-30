/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class levelOfTree {
    
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
        //root=addNode(root,10);
        for(int k=0;k<h;k++)
        {
                 
                 System.out.println("Max level: "+getmaxLevel(root[k],root[k])+" \n enter node to get level: ");
                 int num=sc.nextInt();
                 System.out.println("level "+getLevel(root[k],num,0));
                 
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
    public static  int getLevel(Node root,int data,int level)
    {
        if(root==null)
            return 0;
        if(root.data==data)
        {
            return level;
        }
//        if(root.left==null && root.right==null)
//            return level;
        int level1=0;
        level1= getLevel(root.left,data,level+1);
         if(level1!=0)
             return level1;
         level1=getLevel(root.right,data,level+1);
         return level1;
    }
    public static int getmaxLevel(Node root,Node head)
    {
      if(root==null)
            return 0;
      if(root.left==null && root.right==null)
        {
            System.out.println("level: "+getLevel(head,root.data, 0)+" data "+root.data);
            return getLevel(head,root.data, 0);
        }
        return Math.max(getmaxLevel(root.left,head),getmaxLevel(root.right,head));
        
    }
    
}
