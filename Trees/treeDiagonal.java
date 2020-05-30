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
import java.util.Stack;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class treeDiagonal {
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
            System.out.println("bfs traversal for tree "+(k+1)+"\n");
            setLevels(root[k], 0);
           // bfs(root[k]);
            System.out.println("Num of diagonal in a tree: ");
            showDiagonal(root[k]);
           // setLevels(root[k]);
            
           
        }
    
       }
    public static void showDiagonal(Node root)
    {
        
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty())
        {
            Node p=q.remove();
            if(p==null)
            {
                System.out.println();
                q.add(null);
                p=q.remove();
                if(p==null)
                    break;
            }
            int sum=0;
            while(p!=null)
            {
                sum+=p.data;

                if(p.left!=null)
                    q.add(p.left);
                p=p.right;
            }
                            System.out.print(sum+" ");
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
