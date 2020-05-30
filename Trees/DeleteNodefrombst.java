/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treeprogramming;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author SUDHANSHU YADAV
 */
public class DeleteNodefrombst {
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
            // System.out.println(minNode(root[k]));
            System.out.println(deleteLeafNode(root[k],sum));
//           Node temp=inorderSuccesor(root[k],sum);
//           //Node temp=ParentNode(root[k],sum);
//            if(temp!=null)
//            System.out.println("inoreder succesor of node "+sum+" is "+temp.data);
//            else
//            {
//                System.out.println("inoreder succesor of node "+sum+" is not present");
//            }
            
            bfs(root[k]);
            
         }

       }
    int sum=0;
    

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
     public static Node ParentNode(Node root,int data)
     {
         Node temp=null;
         if(root==null)
             return null;
         if(root.left!=null && root.left.data==data)
         {
             return root;
         }
         if(root.right!=null && root.right.data==data)
         {
             return root;
         }
         if(root.left!=null && ParentNode(root.left,data)!=null)
         {
             temp=ParentNode(root.left,data);
             return temp;
         }
          if(root.right!=null && ParentNode(root.right,data)!=null)
         {
             temp=ParentNode(root.right,data);
             return temp;
         }
         
         
         return temp;
     }
     public static boolean deleteLeafNode(Node root,int data)
     {
         if(root==null)
             return false;
         
         if(root.left!=null && data==root.left.data) 
         {
            if(root.left.left==null && root.left.right==null)
            {
                root.left=null;
                return true;
            }
             else if(root.left.left!=null && root.left.right!=null)
            {
                int min=0;
                if(root.left.right!=null)
                 min=minNode(root.left.right);
                else
                {
                    System.out.println(" min didnt find: "+min);
                }
                boolean status=deleteLeafNode(root,min);
                if(status)
                {
                    root.left.data=min;
                     System.out.println(" delete0 left MIN: "+min);
                }
                else{
                    System.out.println("not delete0 left");
                }
            }
            else if(root.left.left!=null || root.left.right!=null)
            {
                Node p=ParentNode(root.left,data);
                if(p!=null)
                {
                    p.left=inorderSuccesor(root, data);
                    System.out.println("parent : "+p.data+" inorder: "+p.left.data);
                }
                else{
                    System.out.println("p is null");
                }
                
            }
           
             return true;
         }
         if(root.right!=null && data==root.right.data){
            if(root.right.right==null && root.right.left==null)
             root.right=null;
             else if(root.right.right!=null && root.right.left!=null)
            {
                
                int min=minNode(root.right.right);
                boolean status=deleteLeafNode(root,min);
                if(status)
                {
                    root.right.data=min;
                     System.out.println(" delete0 right MIN: "+min);
                }
                else{
                    System.out.println("not delete0 right");
                }
            }
            else if(root.right.right!=null || root.right.left!=null)
            {
                Node p=ParentNode(root,data);
                if(p!=null)
                {
                    p.right=inorderSuccesor(root, data);
                    System.out.println("parent : "+p.data+" inorder: "+p.right.data);
                }
                else{
                    System.out.println("p is null right");
                }
            
            }

             return true;
         }
         
         
         if(root.left!=null && deleteLeafNode(root.left,data))
             return true;
         
         if(root.right!=null && deleteLeafNode(root.right, data))
             return true;
         return false;
     }
     public static Node inorderSuccesor(Node root,int data)
     {
         Node temp=null;
         if(root==null)
             return null;
         if(root.left!=null && root.data==data)
         {
             System.out.println("data found: "+root.left.data);
             return root.left;
         }
         if(root.right!=null && root.data==data)
         { 
             System.out.println("data found: "+root.right.data);
             return root.right;
         }
         if(root.left!=null)
         {
             temp=inorderSuccesor(root.left, data);
             if(temp!=null)
             return temp;
         }
         if(root.right!=null)
         {
             temp=inorderSuccesor(root.right, data);
             if(temp!=null)
             return temp;
         }
             
         return temp;
     }
     static int minNode=Integer.MAX_VALUE;
     public static int minNode(Node root){
         if(root==null)
             return 0;
         if(root.left==null && root.right==null)
         {
             minNode=Math.min(root.data,minNode);
         }
         if(root.left!=null)
          minNode(root.left);
         
         if(root.right!=null)
             minNode(root.right);
         
         return minNode;
         
     }
      public static void bfs(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty())
        {
            //Node p=q.peek();
            
            Node p=q.poll();     
            if(p==null && q.peek()==null)
                break;
            
            if(p==null)
            {
                q.add(null);
                System.out.println();
            } 
            else{
            System.out.print(p.data+" -> ");
            if(p.left!=null)
                q.add(p.left);
            
            if(p.right!=null)
                q.add(p.right);
            
            }
        }
        
    }

}
