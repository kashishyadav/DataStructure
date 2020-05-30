/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class bottomView {
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
               //  bfs(root[k]);
              bottomView(root[k]);
                // printVertical(root[k]);
                 
         }
//         Node root = new Node(20); 
//    root.left = new Node(8); 
//    root.right = new Node(22); 
//    root.left.left=new Node(5);
//    root.left.right = new Node(3); 
//    root.left.right.right = new Node(14); 
//    root.left.right.left = new Node(10);
//    root.right.right=new Node(25);
//    root.right.left=new Node(4);
//        Node root = new Node(1);
//		root.left = new Node(2);
//		root.right = new Node(3);
//		root.left.right = new Node(4);
//		root.right.left = new Node(5);
//		root.right.right = new Node(6);
//		root.right.left.left = new Node(7);
//		root.right.left.right = new Node(8);

      
       
    
    
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
         TreeMap<Integer,pair> hm=new TreeMap<>();
         topTraversal(root, hm, 0, 0);
         for(Map.Entry<Integer,pair> e:hm.entrySet())
         {
             System.out.print(e.getValue().data+" ");
         }
     }
     public static void topTraversal(Node root,TreeMap<Integer,pair> hm,int h,int hd)
     {
         if(root==null)
             return;
         
         if(!hm.containsKey(hd))
         {
             
             hm.put(hd,new pair(root.data, h));
         }
         else{
             pair p=hm.get(hd);
             if(p.h<=h)
             {
                  hm.remove(hd);
                  hm.put(hd,new pair(root.data, h));
             }
         }
         topTraversal(root.left,hm, h+1, hd-1);
         topTraversal(root.right, hm, h+1, hd+1);
     }
   
}
