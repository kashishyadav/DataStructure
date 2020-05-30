/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import static treeprogramming.NumLeafNodes.numOfLeaf;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class RoottoLeaf {
    //static Stack<Integer> s=new Stack<>();
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
            System.out.println("Num of leaf nodes in a tree: "+k+" "+" print leaf: ");
            Stack<Integer> s=new Stack<>();
            rootToLeaf(root[k],s);
            System.out.println("root to leaf..................iterative");
            IterativeRootToLeaf(root[k]);
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
       public static void rootToLeaf(Node root,Stack s)
       {
           //Stack<Integer> s=new Stack<>();
           if(root==null)
               return;
           
           s.push(root.data);
           
           if(root.left==null && root.right==null)
           {
               System.out.println("stackb length: "+s.size());
               System.out.println(s);
               //printLeaf(s);               
               //return;
           }
           else{
           System.out.println("stackb length when left call : "+s.size());
           rootToLeaf(root.left,s);
           System.out.println("stackb length when right call : "+s.size());
           rootToLeaf(root.right,s);
           }
           if(!s.isEmpty())
                s.pop();
           
           
       }
       public static void printLeaf(Node curr,HashMap<Node,Node> hm)
       {
           Stack<Node> s=new Stack<>();
           while(curr!=null)
           {
               s.push(curr);
               curr=hm.get(curr);
           }
           System.out.println("path ton leaf: ");
           while(!s.isEmpty())
           {
               Node temp=s.pop();
               System.out.print(temp.data+"->");
           }
           System.out.println();
       }
       public static void IterativeRootToLeaf(Node root)
       {
           if(root==null)
               return;
           Stack<Node> s=new Stack<>();
           s.push(root);
           
           HashMap<Node,Node> hm=new HashMap<>();
           hm.put(root,null);
           while(!s.isEmpty())
           {
               Node current=s.pop();
               if(current.left==null && current.right==null)
               {
                   printLeaf(current,hm);
               }
               if(current.right!=null)
               {
                   hm.put(current.right,current);
                   s.push(current.right);
               }
               if(current.left!=null)
               {
                   hm.put(current.left,current);
                   s.push(current.left);
               }
           }
       }
       
       
}
