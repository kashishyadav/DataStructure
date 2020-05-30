/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class verticalOrderTraversal {
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
                 
                 printVertical(root[k]);
                 
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
    public static void traversalVertical(Node root,TreeMap<Integer,Vector<Integer>> tm,int hd)
    {
        if(root==null)
            return;
        
        Vector<Integer> v=tm.get(hd);
        if(v==null)
        {
            v=new Vector<Integer>();
            v.add(root.data);
        }
        else{
            v.add(root.data);
        }
        tm.put(hd,v);
        traversalVertical(root.left, tm, hd-1);
        traversalVertical(root.right, tm, hd+1);
    }
    public static void printVertical(Node root)
    {
        TreeMap<Integer,Vector<Integer>> tm=new TreeMap<>();
        int hd=0;
        
        traversalVertical(root,tm,hd);
        int s=tm.size();
        int h=0;
//        for(int i: tm.keySet())
//        {
//           if(h>s/2)
//               break;
//           
//           if(tm.containsKey(-i))
//           {
//               System.out.println(tm.values());
//           }
//           h++;
//        }
        for(Entry<Integer,Vector<Integer>> e:tm.entrySet())
        {
            
            
            System.out.println(e.getValue());
        }
    }
    
}
