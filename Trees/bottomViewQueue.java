/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class bottomViewQueue {
    
       static class Node
      {
        int data;
        Node left;
        int d;
        Node right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
            this.d=Integer.MIN_VALUE;
        }
        public void setd_val(int d)
        {
            this.d=d;
        }
    }
   static class pair{
       int data;
       int h;
       pair(int data,int h)
       {
           this.data=data;
           this.h=h;
       }
   }
  
    public static void main(String arg[])
    { 
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number of tree: ");
//        int t=sc.nextInt();
//        Node root[]=new Node[t];
//        int h=t;
//        int j=0;
//        while(t>0)
//        {
//            System.out.println("enter the number of nodes: ");
//            int n=sc.nextInt();
//            for(int i=0;i<n;i++)
//            {
//                System.out.println("enter the nodes: ");
//                root[j]=addNode(root[j],sc.nextInt());
//            }
//            --t;
//            j++;
//            
//        }
//        //root=addNode(root,10);
//        for(int k=0;k<h;k++)
//        {
//               //  bfs(root[k]);
//              bottomView(root[k]);
//                // printVertical(root[k]);
//                 
//         }
         Node root = new Node(20); 
    root.left = new Node(8); 
    root.right = new Node(22); 
    root.left.left=new Node(5);
    root.left.right = new Node(3); 
    root.left.right.right = new Node(14); 
    root.left.right.left = new Node(10);
    root.right.right=new Node(25);
    root.right.left=new Node(4);
//                Node root = new Node(1);
//		root.left = new Node(2);
//		root.right = new Node(3);
//		root.left.right = new Node(4);
//		root.right.left = new Node(5);
//		root.right.right = new Node(6);
//		root.right.left.left = new Node(7);
//		root.right.left.right = new Node(8);

                bottomView(root);
       
    
    
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
    public static void bottomView(Node root)
    {
        int hd=0;
        Queue<Node>q=new LinkedList<>();
        Map<Integer,Integer> m=new TreeMap<>();
        root.d=hd;
        q.add(root);
        while(!q.isEmpty())
        {
            Node n=q.poll();
            hd=n.d;
            m.put(hd,n.data);
            if(n.left!=null)
            {
                n.left.d=hd-1;
                q.add(n.left);
                
            }
            if(n.right!=null)
            {
                n.right.d=hd+1;
                q.add(n.right);

            }
        }
        for(java.util.Map.Entry<Integer,Integer> e:m.entrySet())
        {
            System.out.print(e.getValue()+" ");
        }
    }
}
