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
public class diameterOfBt {
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
           
            System.out.println("diameter:"+diameterOfTree(root[k]));      
            bfs(root[k]);
            
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
      public static int diameterOfTree(Node root){
          if(root==null)
              return 0;
          int h=0;
          if(root.left!=null)
              h=h+height(root.left,1);
          if(root.right!=null)
              h=h+height(root.right,1);
          return h+1;
      }
      public static int height(Node root,int h)
      {
          if(root==null)
              return 0;
          if(root.left==null && root.right==null)
              return h;
          return Math.max(height(root.left,h+1),height(root.right,h+1));
      }
}
