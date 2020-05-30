/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.Scanner;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class NodewithKLeaf {
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
            System.out.println("enter k: ");
            int a=sc.nextInt();
            btWithKleaves(root[k],a);
         }

       }

   public static void btWithKleaves(Node root, int k)
    {
        StringBuilder sb=new StringBuilder();
        int k1=nodeWithKLeaf(root,k,sb);
        if(sb.length()==0)
        System.out.println("-1");
        else
        System.out.println(sb);
    }
    public static int nodeWithKLeaf(Node root,int a,StringBuilder sb)
   {
       if(root==null)
           return 0;
          if(root.left==null && root.right==null)
           return 1;
       int total=nodeWithKLeaf(root.left,a,sb)+nodeWithKLeaf(root.right,a,sb);
       
       if(total==a)
       sb.append(root.data+" ");
          //System.out.print(root.data+" ");
          
       return total;
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
