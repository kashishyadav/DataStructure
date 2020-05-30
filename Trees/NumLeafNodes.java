/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class NumLeafNodes {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
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
            bfs(root[k]);
            System.out.println("Num of leaf nodes in a tree: "+k+" "+numOfLeaf(root[k])+" print leaf: ");
            printLeaf(root[k]);
            
           // System.out.println("sumtree "+sumTree(root[k]));
           
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
            
            System.out.print(n.data+" -> ");
        }
        System.out.println();
        
    }
       public static int numOfLeaf(Node root)
       {
           if(root==null)
               return 0;
           if(root.left==null && root.right==null)
           {
              System.out.print(root.data+" -> "); 
               return 1;
           }
           
           int count=numOfLeaf(root.left)+numOfLeaf(root.right);
           return count;
       }
       public static void printLeaf(Node root)
       {
           if(root==null)
           {
               System.out.println("no node");
               return;
           }
           if(root.left==null && root.right==null)
           {
               System.out.print(root.data+" -> ");
               return;
               //return 1;
           }
           
           numOfLeaf(root.left);
           numOfLeaf(root.right);
          // return 
       }
       
}
