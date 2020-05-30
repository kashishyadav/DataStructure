/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class diagonalUsingHm {
    
       static class Node{
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
            System.out.println("bfs traversal for tree "+(k+1)+"\n");
            setLevels(root[k], 0);
            bfs(root[k]);
           HashMap<Integer,ArrayList<Integer>>hm= bfsDiagonal(root[k]);
            System.out.println("Num of diagonal in a tree: ");
            display(hm);
            System.out.println("Num of level in a tree: "+getmaxLevel(root[k]));
           // showDiagonal(root[k]);
            //setLevels(root[k]);
            
           
        }
    
      
    }
      public static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty())
        {
            Node n=q.peek();
            q.poll();
            if(n.left!=null)
                q.add(n.left);
            
            if(n.right!=null)
                q.add(n.right);
            
            System.out.println(n.data+" -> "+n.d);
        }
        
    }
    public static void display(HashMap<Integer,ArrayList<Integer>>hm)
    {
        for(List al:hm.values())
        {
//            
            System.out.println(al);
        }
    }
    public static void setLevels(Node root,int d)
    {
        if(root==null)
            return;
        
       if(root.left==null && root.right==null)
       {
           root.setd_val(d);
           return;
       }
       
        if(root.left!=null )
        {
            System.out.println("left traversal "+d);
            setLevels(root.left, d+1);
            System.out.println(root.data+" "+d);
            root.setd_val(d);
        }
            
        if(root.right!=null)
        {
            System.out.println("right traversal "+d);
            setLevels(root.right,d);
            System.out.println(root.data+" "+d);
            root.setd_val(d);
        }
            //
    }
    public static int getmaxLevel(Node root)
    {
        if(root==null)
            return 0;
      if(root.left==null && root.right==null)
        {
            return root.d;
        }
        return Math.max(getmaxLevel(root.left),getmaxLevel(root.right));
      //  return 0;
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
     
    public static HashMap<Integer,ArrayList<Integer>> bfsDiagonal(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int l=getmaxLevel(root);
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<=l;i++)
        {
            hm.put(i,new ArrayList<Integer>());
        }
        
        int d1=0,d2=0;
        hm.get(0).add(root.data);
        while(!q.isEmpty())
        {
            Node n=q.peek();
            q.poll();
            if(n.left!=null)
            {
                int g=n.left.data;
                hm.get(n.left.d).add(g);
                q.add(n.left);
            }
            
            if(n.right!=null)
            {
                int g=n.right.data;
                hm.get(n.right.d).add(g);
                q.add(n.right);
             
            }
            
        }
        System.out.println("hm "+hm);
        return hm;
    }
       
     
       
}
